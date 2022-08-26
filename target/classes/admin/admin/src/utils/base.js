const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootnu0q1/",
            name: "springbootnu0q1",
            // 退出到Home page链接
            indexUrl: 'http://localhost:8080/springbootnu0q1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "A rescue platform for stray animals."
        } 
    }
}
export default base
