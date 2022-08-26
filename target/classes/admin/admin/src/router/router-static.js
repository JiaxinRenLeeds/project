import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import dongwuleixing from '@/views/modules/dongwuleixing/list'
    import zhiyuanzheshenqingbiao from '@/views/modules/zhiyuanzheshenqingbiao/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import lingyangxinxi from '@/views/modules/lingyangxinxi/list'
    import quxiaolingyangxinxi from '@/views/modules/quxiaolingyangxinxi/list'
    import zhiyuantuanduihuodong from '@/views/modules/zhiyuantuanduihuodong/list'
    import liulangdongwuxinxi from '@/views/modules/liulangdongwuxinxi/list'
    import baominghuodong from '@/views/modules/baominghuodong/list'
    import discusszhiyuantuanduihuodong from '@/views/modules/discusszhiyuantuanduihuodong/list'
    import discussliulangdongwuxinxi from '@/views/modules/discussliulangdongwuxinxi/list'
    import quxiaobaominghuodong from '@/views/modules/quxiaobaominghuodong/list'
    import config from '@/views/modules/config/list'
    import zhiyuanzhe from '@/views/modules/zhiyuanzhe/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: 'Home page',
    component: Index,
    children: [{
      // 这里不设置Value，是把main作为默认Page面
      path: '/',
      name: 'Home page',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: 'Change the password',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: 'Personal information',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: 'Stray animals news',
        component: news
      }
      ,{
	path: '/dongwuleixing',
        name: 'Animal type',
        component: dongwuleixing
      }
      ,{
	path: '/zhiyuanzheshenqingbiao',
        name: 'Volunteer application form',
        component: zhiyuanzheshenqingbiao
      }
      ,{
	path: '/huiyuan',
        name: 'User',
        component: huiyuan
      }
      ,{
	path: '/lingyangxinxi',
        name: 'Adoption information',
        component: lingyangxinxi
      }
      ,{
	path: '/quxiaolingyangxinxi',
        name: 'Cancel adoption information',
        component: quxiaolingyangxinxi
      }
      ,{
	path: '/zhiyuantuanduihuodong',
        name: '志愿团队活动',
        component: zhiyuantuanduihuodong
      }
      ,{
	path: '/liulangdongwuxinxi',
        name: 'Stray animal information',
        component: liulangdongwuxinxi
      }
      ,{
	path: '/baominghuodong',
        name: 'Registration activity',
        component: baominghuodong
      }
      ,{
	path: '/discusszhiyuantuanduihuodong',
        name: '志愿团队活动评论',
        component: discusszhiyuantuanduihuodong
      }
      ,{
	path: '/discussliulangdongwuxinxi',
        name: 'Stray animal information comment',
        component: discussliulangdongwuxinxi
      }
      ,{
	path: '/quxiaobaominghuodong',
        name: 'Cancel registration activity',
        component: quxiaobaominghuodong
      }
      ,{
	path: '/config',
        name: 'Rotary-cast graph management',
        component: config
      }
      ,{
	path: '/zhiyuanzhe',
        name: 'Volunteer',
        component: zhiyuanzhe
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: 'Home page',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
