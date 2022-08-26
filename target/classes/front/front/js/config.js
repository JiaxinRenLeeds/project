
var projectName = 'A rescue platform for stray animals.';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: 'Personal center',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: 'My collection',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: 'Stray animal information',
	url: './pages/liulangdongwuxinxi/list.html'
}, 
{
	name: 'Volunteer team activities',
	url: './pages/zhiyuantuanduihuodong/list.html'
}, 

{
	name: 'Stray animals news',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootnu0q1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","View","Edit","Delete"],"menu":"User","menuJump":"列表","tableName":"huiyuan"}],"menu":"User management"},{"child":[{"buttons":["新增","View","Edit","Delete"],"menu":"Volunteer","menuJump":"列表","tableName":"zhiyuanzhe"}],"menu":"Volunteer management"},{"child":[{"buttons":["新增","View","Edit","Delete","View the comment"],"menu":"Stray animal information","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information manage"},{"child":[{"buttons":["View","Edit","Delete","Check"],"menu":"Adoption information","menuJump":"列表","tableName":"lingyangxinxi"}],"menu":"Adoption information management"},{"child":[{"buttons":["View","Delete","Edit","Check"],"menu":"Cancel adoption information","menuJump":"列表","tableName":"quxiaolingyangxinxi"}],"menu":"Cancel adoption information management"},{"child":[{"buttons":["新增","View","Edit","Delete","View the comment"],"menu":"Volunteer team activities","menuJump":"列表","tableName":"zhiyuantuanduihuodong"}],"menu":"Volunteer team activities management"},{"child":[{"buttons":["View","Edit","Delete","Check"],"menu":"Volunteer application form","menuJump":"列表","tableName":"zhiyuanzheshenqingbiao"}],"menu":"Volunteer application form management"},{"child":[{"buttons":["View","Check","Delete"],"menu":"Registration activity","menuJump":"列表","tableName":"baominghuodong"}],"menu":"Registration activity management"},{"child":[{"buttons":["Delete","View","Check"],"menu":"Cancel registration activity","menuJump":"列表","tableName":"quxiaobaominghuodong"}],"menu":"Cancel registration activity management"},{"child":[{"buttons":["新增","View","Edit","Delete"],"menu":"Animal type","menuJump":"列表","tableName":"dongwuleixing"}],"menu":"Animal type management"},{"child":[{"buttons":["新增","View","Edit","Delete"],"menu":"Stray animals news","tableName":"news"},{"buttons":["新增","View","Edit","Delete"],"menu":"Rotary-cast graph management","tableName":"config"}],"menu":"System management"}],"frontMenu":[{"child":[{"buttons":["View","View the comment","Apply for adoption"],"menu":"Stray animal information list","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information moudle"},{"child":[{"buttons":["View","View the comment"],"menu":"Volunteer team activities list","menuJump":"列表","tableName":"zhiyuantuanduihuodong"}],"menu":"Volunteer team activities moudle"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"Administrator","tableName":"users"},{"backMenu":[{"child":[{"buttons":["View","View the comment"],"menu":"Stray animal information","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information manage"},{"child":[{"buttons":["View","Cancel adoption"],"menu":"Adoption information","menuJump":"列表","tableName":"lingyangxinxi"}],"menu":"Adoption information management"},{"child":[{"buttons":["View"],"menu":"Cancel adoption information","menuJump":"列表","tableName":"quxiaolingyangxinxi"}],"menu":"Cancel adoption information management"},{"child":[{"buttons":["新增","View","Edit","Delete"],"menu":"Volunteer application form","menuJump":"列表","tableName":"zhiyuanzheshenqingbiao"}],"menu":"Volunteer application form management"}],"frontMenu":[{"child":[{"buttons":["View","View the comment","Apply for adoption"],"menu":"Stray animal information list","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information moudle"},{"child":[{"buttons":["View","View the comment"],"menu":"Volunteer team activities list","menuJump":"列表","tableName":"zhiyuantuanduihuodong"}],"menu":"Volunteer team activities moudle"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"User","tableName":"huiyuan"},{"backMenu":[{"child":[{"buttons":["View","View the comment"],"menu":"Stray animal information","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information manage"},{"child":[{"buttons":["View"],"menu":"Adoption information","menuJump":"列表","tableName":"lingyangxinxi"}],"menu":"Adoption information management"},{"child":[{"buttons":["View"],"menu":"Cancel adoption information","menuJump":"列表","tableName":"quxiaolingyangxinxi"}],"menu":"Cancel adoption information management"},{"child":[{"buttons":["View","Apply","View the comment"],"menu":"Volunteer team activities","menuJump":"列表","tableName":"zhiyuantuanduihuodong"}],"menu":"Volunteer team activities management"},{"child":[{"buttons":["View","Edit","Delete","CancelApply"],"menu":"Registration activity","menuJump":"列表","tableName":"baominghuodong"}],"menu":"Registration activity management"},{"child":[{"buttons":["View","Edit","Delete"],"menu":"Cancel registration activity","menuJump":"列表","tableName":"quxiaobaominghuodong"}],"menu":"Cancel registration activity management"}],"frontMenu":[{"child":[{"buttons":["View","View the comment","Apply for adoption"],"menu":"Stray animal information list","menuJump":"列表","tableName":"liulangdongwuxinxi"}],"menu":"Stray animal information moudle"},{"child":[{"buttons":["View","View the comment"],"menu":"Volunteer team activities list","menuJump":"列表","tableName":"zhiyuantuanduihuodong"}],"menu":"Volunteer team activities moudle"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"Volunteer","tableName":"zhiyuanzhe"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
