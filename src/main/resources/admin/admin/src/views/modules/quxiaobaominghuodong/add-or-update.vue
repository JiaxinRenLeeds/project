<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="Activity name" prop="huodongmingcheng">
          <el-input v-model="ruleForm.huodongmingcheng" 
              placeholder="Activity name" clearable  :readonly="ro.huodongmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="Activity name" prop="huodongmingcheng">
              <el-input v-model="ruleForm.huodongmingcheng" 
                placeholder="Activity name" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="Activity time" prop="huodongshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.huodongshijian" 
                type="datetime"
                placeholder="Activity time">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.huodongshijian" label="Activity time" prop="huodongshijian">
              <el-input v-model="ruleForm.huodongshijian" 
                placeholder="Activity time" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="Activity locaton" prop="huodongdidian">
          <el-input v-model="ruleForm.huodongdidian" 
              placeholder="Activity locaton" clearable  :readonly="ro.huodongdidian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="Activity locaton" prop="huodongdidian">
              <el-input v-model="ruleForm.huodongdidian" 
                placeholder="Activity locaton" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.tupian" label="Photo" prop="tupian">
          <file-upload
          tip="Click to upload photo"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
          @change="tupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.tupian" label="Photo" prop="tupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="Volunteer account" prop="zhiyuanzhezhanghao">
          <el-input v-model="ruleForm.zhiyuanzhezhanghao" 
              placeholder="Volunteer account" clearable  :readonly="ro.zhiyuanzhezhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="Volunteer account" prop="zhiyuanzhezhanghao">
              <el-input v-model="ruleForm.zhiyuanzhezhanghao" 
                placeholder="Volunteer account" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="Volunteer name" prop="zhiyuanzhexingming">
          <el-input v-model="ruleForm.zhiyuanzhexingming" 
              placeholder="Volunteer name" clearable  :readonly="ro.zhiyuanzhexingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="Volunteer name" prop="zhiyuanzhexingming">
              <el-input v-model="ruleForm.zhiyuanzhexingming" 
                placeholder="Volunteer name" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="Volunteer phonenumber" prop="zhiyuanzheshouji">
          <el-input v-model="ruleForm.zhiyuanzheshouji" 
              placeholder="Volunteer phonenumber" clearable  :readonly="ro.zhiyuanzheshouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="Volunteer phonenumber" prop="zhiyuanzheshouji">
              <el-input v-model="ruleForm.zhiyuanzheshouji" 
                placeholder="Volunteer phonenumber" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="Registration time" prop="baomingshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.baomingshijian" 
                type="datetime"
                placeholder="Registration time">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.baomingshijian" label="Registration time" prop="baomingshijian">
              <el-input v-model="ruleForm.baomingshijian" 
                placeholder="Registration time" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="Cancel registration time" prop="quxiaobaomingshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.quxiaobaomingshijian" 
                type="datetime"
                placeholder="Cancel registration time">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.quxiaobaomingshijian" label="Cancel registration time" prop="quxiaobaomingshijian">
              <el-input v-model="ruleForm.quxiaobaomingshijian" 
                placeholder="Cancel registration time" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="Activity content" prop="huodongneirong">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="Activity content"
                  v-model="ruleForm.huodongneirong" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.huodongneirong" label="Activity content" prop="huodongneirong">
                    <span>{{ruleForm.huodongneirong}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="Cancel reason" prop="quxiaoyuanyin">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.quxiaoyuanyin" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.quxiaoyuanyin" label="Cancel reason" prop="quxiaoyuanyin">
                    <span v-html="ruleForm.quxiaoyuanyin"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">Submit</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">Cancel</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">Return</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// ???????????????????????????url???ID number??????
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("Please enter the right ID number."));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("Please enter the ?????????URL??????"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("Please enter the right phone number."));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("Please enter the ?????????????????????"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("Please enter the right email."));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("Please enter the ??????"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("Please enter the ??????"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(36, 194, 205, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"#409EFF","btnSaveBorderWidth":"0px"},
      id: '',
      type: '',
      ro:{
	huodongmingcheng : false,
	huodongshijian : false,
	huodongdidian : false,
	huodongneirong : false,
	tupian : false,
	zhiyuanzhezhanghao : false,
	zhiyuanzhexingming : false,
	zhiyuanzheshouji : false,
	baomingshijian : false,
	quxiaobaomingshijian : false,
	quxiaoyuanyin : false,
	sfsh : false,
	shhf : false,
      },
      ruleForm: {
        huodongmingcheng: '',
        huodongshijian: '',
        huodongdidian: '',
        huodongneirong: '',
        tupian: '',
        zhiyuanzhezhanghao: '',
        zhiyuanzhexingming: '',
        zhiyuanzheshouji: '',
        baomingshijian: '',
        quxiaobaomingshijian: '',
        quxiaoyuanyin: '',
        shhf: '',
      },
      rules: {
          huodongmingcheng: [
          ],
          huodongshijian: [
          ],
          huodongdidian: [
          ],
          huodongneirong: [
          ],
          tupian: [
          ],
          zhiyuanzhezhanghao: [
          ],
          zhiyuanzhexingming: [
          ],
          zhiyuanzheshouji: [
          ],
          baomingshijian: [
          ],
          quxiaobaomingshijian: [
          ],
          quxiaoyuanyin: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // ??????
    download(file){
      window.open(`${file}`)
    },
    // ?????????
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='huodongmingcheng'){
            this.ruleForm.huodongmingcheng = obj[o];
	    this.ro.huodongmingcheng = true;
            continue;
          }
          if(o=='huodongshijian'){
            this.ruleForm.huodongshijian = obj[o];
	    this.ro.huodongshijian = true;
            continue;
          }
          if(o=='huodongdidian'){
            this.ruleForm.huodongdidian = obj[o];
	    this.ro.huodongdidian = true;
            continue;
          }
          if(o=='huodongneirong'){
            this.ruleForm.huodongneirong = obj[o];
	    this.ro.huodongneirong = true;
            continue;
          }
          if(o=='tupian'){
            this.ruleForm.tupian = obj[o];
	    this.ro.tupian = true;
            continue;
          }
          if(o=='zhiyuanzhezhanghao'){
            this.ruleForm.zhiyuanzhezhanghao = obj[o];
	    this.ro.zhiyuanzhezhanghao = true;
            continue;
          }
          if(o=='zhiyuanzhexingming'){
            this.ruleForm.zhiyuanzhexingming = obj[o];
	    this.ro.zhiyuanzhexingming = true;
            continue;
          }
          if(o=='zhiyuanzheshouji'){
            this.ruleForm.zhiyuanzheshouji = obj[o];
	    this.ro.zhiyuanzheshouji = true;
            continue;
          }
          if(o=='baomingshijian'){
            this.ruleForm.baomingshijian = obj[o];
	    this.ro.baomingshijian = true;
            continue;
          }
          if(o=='quxiaobaomingshijian'){
            this.ruleForm.quxiaobaomingshijian = obj[o];
	    this.ro.quxiaobaomingshijian = true;
            continue;
          }
          if(o=='quxiaoyuanyin'){
            this.ruleForm.quxiaoyuanyin = obj[o];
	    this.ro.quxiaoyuanyin = true;
            continue;
          }
        }
      }
      // ??????????????????
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.zhiyuanzhezhanghao!=''&&json.zhiyuanzhezhanghao){
              		this.ruleForm.zhiyuanzhezhanghao = json.zhiyuanzhezhanghao
		}
		if(json.zhiyuanzhexingming!=''&&json.zhiyuanzhexingming){
              		this.ruleForm.zhiyuanzhexingming = json.zhiyuanzhexingming
		}
		if(json.zhiyuanzheshouji!=''&&json.zhiyuanzheshouji){
              		this.ruleForm.zhiyuanzheshouji = json.zhiyuanzheshouji
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // ??????????????????
    info(id) {
      this.$http({
        url: `quxiaobaominghuodong/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//????????????Upload photo????????????????????????
	let reg=new RegExp('../../../upload','g')//g????????????
	this.ruleForm.quxiaoyuanyin = this.ruleForm.quxiaoyuanyin.replace(reg,'../../../springbootnu0q1/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // Submit
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}













      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `quxiaobaominghuodong/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "Success",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.quxiaobaominghuodongCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // ??????uuid
    getUUID () {
      return new Date().getTime();
    },
    // Return
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.quxiaobaominghuodongCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    tupianUploadChange(fileUrls) {
	this.ruleForm.tupian = fileUrls;
			this.addEditUploadStyleChange()
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // ??????????????????
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // ??????
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // Return
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
