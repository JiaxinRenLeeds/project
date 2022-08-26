<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :rules="rules"
      :model="ruleForm"
      label-width="80px"
    >
      <el-form-item label="Original password" prop="password">
        <el-input v-model="ruleForm.password" show-password></el-input>
      </el-form-item>
      <el-form-item label="New password" prop="newpassword">
        <el-input v-model="ruleForm.newpassword" show-password></el-input>
      </el-form-item>
      <el-form-item label="Confirm password" prop="repassword">
        <el-input v-model="ruleForm.repassword" show-password></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">Confirm</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      dialogVisible: false,
      ruleForm: {},
      user: {},
      rules: {
        password: [
          {
            required: true,
            message: "Password不能为空",
            trigger: "blur"
          }
        ],
        newpassword: [
          {
            required: true,
            message: "New password can not be empty.",
            trigger: "blur"
          }
        ],
        repassword: [
          {
            required: true,
            message: "Confirm password can not be empty.",
            trigger: "blur"
          }
        ]
      }
    };
  },
  mounted() {
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.user = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    onLogout() {
      this.$storage.remove("Token");
      this.$router.replace({ name: "login" });
    },
    // EditPassword
    onUpdateHandler() {
      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          var password = "";
          if (this.user.mima) {
            password = this.user.mima;
          } else if (this.user.password) {
            password = this.user.password;
          }
          if (this.ruleForm.password != password) {
            this.$message.error("Original password is wrong.");
            return;
          }
          if (this.ruleForm.newpassword != this.ruleForm.repassword) {
            this.$message.error("The two passwords are different.");
            return;
          }
          this.user.password = this.ruleForm.newpassword;
          this.user.mima = this.ruleForm.newpassword;
          this.$http({
            url: `${this.$storage.get("sessionTable")}/update`,
            method: "post",
            data: this.user
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "The password is successfully changed and takes effect upon next login",
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
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
