<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(255, 255, 255, 0.17);borderRadius:10px">
        <h1 class="h1" style="color:rgba(36, 194, 205, 1);fontSize:28px;">A rescue platform for stray animals.Register</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">User account</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuzhanghao" class="input" type="text" placeholder="User account">
			   </div>
			 </div> -->
			<el-form-item label="User account" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.yonghuzhanghao" autocomplete="off" placeholder="User account"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">Password</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="Password">
			   </div>
			 </div> -->
			<el-form-item label="Password" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="Password" type="password"#elsetype="text" />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">User name</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuxingming" class="input" type="text" placeholder="User name">
			   </div>
			 </div> -->
			<el-form-item label="User name" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.yonghuxingming" autocomplete="off" placeholder="User name"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">Contact number</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="Contact number">
			   </div>
			 </div> -->
			<el-form-item label="Contact number" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="Contact number"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">ID number</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="ID number">
			   </div>
			 </div> -->
			<el-form-item label="ID number" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="ID number"  />
			</el-form-item>
			<!-- <div v-if="tableName=='huiyuan'" class="input-group">
			   <div class="label">Email</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="Email">
			   </div>
			 </div> -->
			<el-form-item label="Email" class="input" v-if="tableName=='huiyuan'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="Email"  />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">Volunteer account</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiyuanzhezhanghao" class="input" type="text" placeholder="Volunteer account">
			   </div>
			 </div> -->
			<el-form-item label="Volunteer account" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.zhiyuanzhezhanghao" autocomplete="off" placeholder="Volunteer account"  />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">Password</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="Password">
			   </div>
			 </div> -->
			<el-form-item label="Password" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="Password" type="password"#elsetype="text" />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">Volunteer name</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiyuanzhexingming" class="input" type="text" placeholder="Volunteer name">
			   </div>
			 </div> -->
			<el-form-item label="Volunteer name" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.zhiyuanzhexingming" autocomplete="off" placeholder="Volunteer name"  />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">Volunteer phonenumber</div>
			   <div class="input-container">
			     <input v-model="ruleForm.zhiyuanzheshouji" class="input" type="text" placeholder="Volunteer phonenumber">
			   </div>
			 </div> -->
			<el-form-item label="Volunteer phonenumber" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.zhiyuanzheshouji" autocomplete="off" placeholder="Volunteer phonenumber"  />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">ID number</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shenfenzheng" class="input" type="text" placeholder="ID number">
			   </div>
			 </div> -->
			<el-form-item label="ID number" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.shenfenzheng" autocomplete="off" placeholder="ID number"  />
			</el-form-item>
			<!-- <div v-if="tableName=='zhiyuanzhe'" class="input-group">
			   <div class="label">Email</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="Email">
			   </div>
			 </div> -->
			<el-form-item label="Email" class="input" v-if="tableName=='zhiyuanzhe'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="Email"  />
			</el-form-item>
			<div style="display: flex;flex-wrap: wrap;width: 100%;justify-content: center;">
				<el-button class="btn" type="primary" @click="login()">Register</el-button>
				<el-button class="btn close" type="primary" @click="close()">Cancel</el-button>
			</div>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">Register</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
      },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    close(){
	this.$router.push({ path: "/login" });
    },
    // Register
    login() {
      if((!this.ruleForm.yonghuzhanghao) && `huiyuan` == this.tableName){
        this.$message.error(`User account不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `huiyuan` == this.tableName){
        this.$message.error(`Password不能为空`);
        return
      }
      if(`huiyuan` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`Please enter the right phone number format.(1xxxxxxxxxx)total 11 number.`);
        return
      }
      if(`huiyuan` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`Please enter the right Id format.(xxxxxxxxxxxxxxxxxx)total 18 number`);
        return
      }
      if(`huiyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`Please enter the right email format.`);
        return
      }
      if((!this.ruleForm.zhiyuanzhezhanghao) && `zhiyuanzhe` == this.tableName){
        this.$message.error(`Volunteer account不能为空`);
        return
      }
      if((!this.ruleForm.mima) && `zhiyuanzhe` == this.tableName){
        this.$message.error(`Password不能为空`);
        return
      }
      if(`zhiyuanzhe` == this.tableName && this.ruleForm.zhiyuanzheshouji&&(!this.$validate.isMobile(this.ruleForm.zhiyuanzheshouji))){
        this.$message.error(`Please enter the right phone number format.(1xxxxxxxxxx)total 11 number`);
        return
      }
      if(`zhiyuanzhe` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`Please enter the right Id format.(xxxxxxxxxxxxxxxxxx)total 18 number`);
        return
      }
      if(`zhiyuanzhe` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`Please enter the right email format.`);
        return
      }
      this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "Registered successfully",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
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
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201124/b960a45e1acf4bc2b364a1664aad3fdb.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(0, 0, 0, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 1px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					margin: 0 10px;
					width: 88px;
					height: 44px;
					color: #fff;
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: rgba(36, 194, 205, 1);
					border-radius: 4px;
					background-color: rgba(36, 194, 205, 1);
				}

				.close {
					margin: 0 10px;
					width: 88px;
					height: 44px;
					color: #409EFF;
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 5px;
					background-color: #FFF;
				}

			}
		}
	}
</style>
