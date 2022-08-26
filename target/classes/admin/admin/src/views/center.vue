<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="User account" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" readonly              placeholder="User account" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="User name" prop="yonghuxingming">
          <el-input v-model="ruleForm.yonghuxingming"               placeholder="User name" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='huiyuan'"  label="Gender" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="Please choose Gender">
            <el-option
                v-for="(item,index) in huiyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="Contact number" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="Contact number" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="ID number" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="ID number" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="Email" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="Email" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='huiyuan'" label="Photo" prop="touxiang">
          <file-upload
          tip="Click to upload photo"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="huiyuantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zhiyuanzhe'"  label="Volunteer account" prop="zhiyuanzhezhanghao">
          <el-input v-model="ruleForm.zhiyuanzhezhanghao" readonly              placeholder="Volunteer account" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zhiyuanzhe'"  label="Volunteer name" prop="zhiyuanzhexingming">
          <el-input v-model="ruleForm.zhiyuanzhexingming"               placeholder="Volunteer name" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='zhiyuanzhe'"  label="Gender" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="Please choose Gender">
            <el-option
                v-for="(item,index) in zhiyuanzhexingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zhiyuanzhe'"  label="Volunteer phonenumber" prop="zhiyuanzheshouji">
          <el-input v-model="ruleForm.zhiyuanzheshouji"               placeholder="Volunteer phonenumber" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zhiyuanzhe'"  label="ID number" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="ID number" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zhiyuanzhe'"  label="Email" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="Email" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='zhiyuanzhe'" label="Photo" prop="touxiang">
          <file-upload
          tip="Click to upload photo"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="zhiyuanzhetouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="User name" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="User name"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">Edit</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，ID number校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      huiyuanxingbieOptions: [],
      zhiyuanzhexingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.huiyuanxingbieOptions = "Male,Female".split(',')
    this.zhiyuanzhexingbieOptions = "Male,Female".split(',')
  },
  methods: {
    huiyuantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    zhiyuanzhetouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.yonghuzhanghao)&& 'huiyuan'==this.flag){
        this.$message.error('User account不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'huiyuan'==this.flag){
        this.$message.error('Password不能为空');
        return
      }
      if( 'huiyuan' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`Please enter the right phone number format.(1xxxxxxxxxx)total 11 number.`);
        return
      }
      if( 'huiyuan' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`Please enter the right Id format.(xxxxxxxxxxxxxxxxxx)total 18 number`);
        return
      }
      if( 'huiyuan' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`Email应输入Email格式`);
        return
      }
      if((!this.ruleForm.zhiyuanzhezhanghao)&& 'zhiyuanzhe'==this.flag){
        this.$message.error('Volunteer account不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'zhiyuanzhe'==this.flag){
        this.$message.error('Password不能为空');
        return
      }
      if( 'zhiyuanzhe' ==this.flag && this.ruleForm.zhiyuanzheshouji&&(!isMobile(this.ruleForm.zhiyuanzheshouji))){
        this.$message.error(`Please enter the right phone number format.(1xxxxxxxxxx)total 11 number`);
        return
      }
      if( 'zhiyuanzhe' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`Please enter the right Id format.(xxxxxxxxxxxxxxxxxx)total 18 number`);
        return
      }
      if( 'zhiyuanzhe' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`Email应输入Email格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`User name不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "Edit信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
