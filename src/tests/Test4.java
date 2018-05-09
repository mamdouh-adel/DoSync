/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;

/**
 *
 * @author pipo
 */
public class Test4 {
    
    public static void main(String[] args){
        
      String source1 ="<!DOCTYPE html><html lang=\"en\" xmlns:fb=\"http://ogp.me/ns/fb#\" xml:lang=\"en\" class=\"\" xmlns=\"http://www.w3.org/1999/xhtml\"><head><script nonce=\"pX3wcD9zX8Q9FSNP9KBL\">\n" +
"window._goch_ = {};\n" +
"window.addEventListener('click', function(event) {\n" +
"    'use strict';\n" +
"    for (var elm = event.target; elm; elm = elm.parentElement) {\n" +
"        if (elm.id &&\n" +
"            window._goch_.hasOwnProperty(elm.id) &&\n" +
"            window._goch_[elm.id].call(elm, event) === false) {\n" +
"            event.preventDefault();\n" +
"        }\n" +
"    }\n" +
"}, true);\n" +
"window._csp_external_script_nonce = \"lHKvey+6rbkB5TlbsO90\"</script><meta content=\"IE=edge, chrome=1\" http-equiv=\"X-UA-Compatible\" /><link href=\"https://www.dropbox.com/1/oauth2/authorize_submit\" rel=\"canonical\" /><meta content=\"origin-when-cross-origin\" name=\"referrer\" /><link href=\"https://cfl.dropboxstatic.com/static/images/favicon-vflk5FiAC.ico\" rel=\"shortcut icon\" /><link href=\"https://cfl.dropboxstatic.com/static/css/main-vflOjozL4.css\" type=\"text/css\" rel=\"stylesheet\" /><!--[if IE]><link href=\"https://cfl.dropboxstatic.com/static/css/main_old_ie-vfljTFv03.css\" type=\"text/css\" rel=\"stylesheet\" /><![endif]--><link href=\"https://cfl.dropboxstatic.com/static/images/dropbox_webclip_60-vflN_uQqB.png\" rel=\"apple-touch-icon\" /><link href=\"https://cfl.dropboxstatic.com/static/images/dropbox_webclip_76-vflVDzAci.png\" rel=\"apple-touch-icon\" sizes=\"76x76\" /><link href=\"https://cfl.dropboxstatic.com/static/images/dropbox_webclip_120-vflppIksR.png\" rel=\"apple-touch-icon\" sizes=\"120x120\" /><link href=\"https://cfl.dropboxstatic.com/static/images/dropbox_webclip_152-vflnR85Xl.png\" rel=\"apple-touch-icon\" sizes=\"152x152\" /><script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">window.ST=+new Date();</script><meta content=\"text/html; charset=UTF-8\" http-equiv=\"content-type\" /><meta content=\"Dropbox is a free service that lets you bring your photos, docs, and videos anywhere and share them easily. Never email yourself a file again!\" name=\"description\" /><meta content=\"online storage, free storage, file sharing, share files, awesome, cloud storage, online backup, cross platform, sync, sharing, mac, windows, os x, linux, backup, collaboration, file versioning, file revisions, remote access, undelete\" name=\"keywords\" /><meta content=\"https://www.dropbox.com/1/oauth2/authorize_submit\" property=\"og:url\" /><meta content=\"Dropbox\" property=\"og:site_name\" /><meta content=\"website\" property=\"og:type\" /><meta content=\"Dropbox is a free service that lets you bring your photos, docs, and videos anywhere and share them easily. Never email yourself a file again!\" property=\"og:description\" /><meta content=\"API Request Authorized - Dropbox\" property=\"og:title\" /><meta content=\"210019893730\" property=\"fb:app_id\" /><meta content=\"https://cfl.dropboxstatic.com/static/images/brand/glyph@2x-vflJ1vxbq.png\" property=\"og:image\" /><meta content=\"summary\" name=\"twitter:card\" /><meta content=\"@Dropbox\" name=\"twitter:site\" /><meta content=\"https://www.dropbox.com/1/oauth2/authorize_submit\" name=\"twitter:url\" /><meta content=\"API Request Authorized - Dropbox\" name=\"twitter:title\" /><meta content=\"Dropbox is a free service that lets you bring your photos, docs, and videos anywhere and share them easily. Never email yourself a file again!\" name=\"twitter:description\" /><meta content=\"https://cfl.dropboxstatic.com/static/images/brand/twitter-card-glyph@2x-vflVqhKLO.png\" name=\"twitter:image\" /><meta content=\"TnuSyOnBMNmtugbpL1ZvW2PbSF9LKvoTzrvOGS9h-b0\" name=\"google-site-verification\" /><meta content=\"EZKIczQcM1-DVUMz8heu1dIhNtxNbLqbaA9-HbOnCQ4\" name=\"google-site-verification\" /><meta content=\"tz8iotmk-pkhui406y41y5bfmfxdwmaa4a-yc0hm6r0fga7s6j0j27qmgqkmc7oovihzghbzhbdjk-uiyrz438nxsjdbj3fggwgl8oq2nf4ko8gi7j4z7t78kegbidl4\" name=\"norton-safeweb-site-verification\" /><meta content=\"https://cfl.dropboxstatic.com/static/images/win8_web_tile-vfl8eyKFU.png\" name=\"msapplication-TileImage\" /><meta content=\"#ffffff\" name=\"msapplication-TileColor\" /><title>API Request Authorized - Dropbox</title><style type=\"text/css\">.hny-clhlz { display: none; }</style> <link href=\"https://cfl.dropboxstatic.com/static/css/account_photo_modal-vflg44N5X.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/connect_v3_desktop-vfliQMsDt.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/developers/developers-constants-vflDSRCSP.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/display_token_desktop-vflI77Mea.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/legacy_packages/components-vflRbDbou.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/scooter/scooter-scoped-vflm9UP03.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://cfl.dropboxstatic.com/static/css/sprites/web_sprites-vflv2MHAO.css\" type=\"text/css\" crossorigin=\"anonymous\" rel=\"stylesheet\" /><link href=\"https://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,600,700&amp;subset=latin,latin-ext\" type=\"text/css\" rel=\"stylesheet\" /><script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">\n" +
"            (function(){\"use strict\";var e,n=window,r=function(){e=[],n.addRequireLoadCallback=function(n){return e.push(n)},n.configureRequire=function(){var e=arguments;n.addRequireLoadCallback(function(){return n.configureRequire.apply(null,e)})},n.define=function(){var e=arguments;n.addRequireLoadCallback(function(){return n.define.apply(null,e)})}};r(),n._insertRequireShim=r,n.InitRequireJs=function(r){n.requireContexts={},requirejs.onError=function(){},n.performance&&null!=n.performance.now&&(requirejs.onResourceLoad=function(e,r,u){var i=n.performance.now(),o=n.requireContexts[e.id];o&&o.require([\"modules/clean/web_module_timing\"],function(e){e.add_module(r,i,o.module_callback_times[r.id])})}),n.configureRequire=r,n.addRequireLoadCallback=function(e){return e()},e.forEach(function(e){return e()})}})();\n" +
"\n" +
"\n" +
"            window.GlobalConstants = {\"CSP_SCRIPT_NONCE\": \"pX3wcD9zX8Q9FSNP9KBL\"};\n" +
"            </script><script async=\"async\" type=\"text/javascript\" src=\"https://cfl.dropboxstatic.com/static/compiled/js/alameda_bundle.min-vfl1lPBgl.js\" nonce=\"lHKvey+6rbkB5TlbsO90\"></script> <script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">\n" +
"            var same_hostname = false;\n" +
"            try {\n" +
"                same_hostname = (top.location.hostname === self.location.hostname);\n" +
"            } catch (error) {}\n" +
"\n" +
"            if (self != top && !same_hostname) {\n" +
"                top.location.replace(self.location.href);\n" +
"                setTimeout(function() {\n" +
"                    window.DB_FRAME_BUST = true;\n" +
"                    document.body.innerHTML = (\n" +
"                        \"<img src='https://cfl.dropboxstatic.com/static/images/logo-vflL7Ces6.png' onClick='top.location.href=window.location.href' />\");\n" +
"                }, 1);\n" +
"            }\n" +
"        </script></head><body class=\"en other  \" dir=\"ltr\"> <div id=\"page-header\" class=\"\"><div id=\"inner-page-header\"><span class=\"home-icon-container\"><div id=\"home-icon\"><a href=\"/\"><img data-js-component-id=\"component6745217937062813469\" width=\"36\" alt=\"Dropbox\" src=\"https://cfl.dropboxstatic.com/static/images/icons/blue_dropbox_glyph-vflOJKOUw.png\" /></a></div></span><div id=\"account-header\" class=\"show-account-photo\"><ul class=\"nav\"><li id=\"header-account-menu\" class=\"top-level-nav-item\"><div data-js-component-id=\"component6745217937062813472\" class=\"bubble-dropdown-container\"><button class=\"header-nav-link button-as-link bubble-dropdown-target bubble-dropdown-target\"><span class=\"avatar-wrapper\" id=\"pyxl6745217937062813473\"><img src=\"https://cfl.dropboxstatic.com/static/images/icons/icon_spacer-vflN3BYt2.gif\" height=\"24\" width=\"24\" data-js-component-id=\"component6745217937062813474\" alt=\"\" class=\"u-l-ib--m avatar-component u-l-ib\" /></span>Ehab Adel<img src=\"https://cfl.dropboxstatic.com/static/images/icons/icon_spacer-vflN3BYt2.gif\" alt=\" Settings\" class=\"s_web_arrow-down-blue link-img sprite sprite_web\" /></button><div class=\"bubble-dropdown top-right\"><div class=\"account-dropdown\"><div class=\"title o-flag\"><div class=\"o-flag__fix u-pad-right-xs clickable\" id=\"pyxl6745217937062813470\"><div class=\"avatar-wrapper\" id=\"pyxl6745217937062813475\"><img src=\"https://cfl.dropboxstatic.com/static/images/icons/icon_spacer-vflN3BYt2.gif\" height=\"32\" width=\"32\" data-js-component-id=\"component6745217937062813476\" alt=\"\" class=\"u-l-ib--m avatar-component u-l-ib\" /></div></div><div class=\"name-container o-flag__flex\"><span class=\"name\">Ehab Adel</span><a href=\"#\" class=\"u-l-b u-font-small\" id=\"pyxl6745217937062813471\">Add account photo</a></div></div><ul><div class=\"email force-no-break\">pipo.adel87@gmail.com</div><div class=\"subheader-text\">888.1 KB of 2 GB used</div><div class=\"quota_graph_container\"><div style=\"width: 0%;\" class=\"quota_graph_bar \"></div></div> <li><a href=\"https://www.dropbox.com/account\" target=\"set([''])\" class=\"standalone clearfix\">Settings</a></li><li><a href=\"https://www.dropbox.com/install\" target=\"\" class=\"standalone clearfix\">Install</a></li><li><a href=\"https://www.dropbox.com/buy?trigger=direct\" target=\"set([''])\" class=\"standalone clearfix\">Upgrade</a></li> <li><a href=\"/logout\" class=\"standalone clearfix\">Sign out</a></li></ul></div><div class=\"bubble-arrow-border\"></div><div class=\"bubble-arrow\"></div></div></div></li></ul></div></div></div>  <div id=\"auth\" class=\"auth-connect-frame auth-connect-frame--standard\"><div><img src=\"https://cfl.dropboxstatic.com/static/images/default_app_icon-vflohrH6B.png\" alt=\"\" id=\"app-icon\" /></div><div id=\"auth-text\"><div>Enter this code into <span class=\"app-name\">testSync1984</span> to finish the process.</div><div id=\"auth-code\"><input type=\"text\" class=\"auth-box\" value=\"j1giBWExI0AAAAAAAAAAJ3osD-75i3-HIZ9XYtxthiE\" id=\"auth-code-input\" /></div></div></div>  <script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">define(\"modules/constants/dropins\", [], function() {\n" +
"            return {\"CHOOSER_APP_KEY\": \"a1gk45gxjylc840\"};\n" +
"        });\n" +
"        define(\"modules/constants/undo_strings\", [], function() {\n" +
"            return {\"UNDO\": \"Undo\"};\n" +
"        });\n" +
"        define(\"modules/constants/page_load\", [], function() {\n" +
"            return {\"USER_LOCALE\": \"en\", \"PUBLIC_MODE_OVERRIDE\": null, \"COUNTRY_OVERRIDE\": null, \"METASERVER_MDB_TAGS\": [\"meta-canary\"], \"CSP_SCRIPT_NONCE\": \"pX3wcD9zX8Q9FSNP9KBL\", \"PAGE_LOAD_TIME\": 1500117920, \"REPO_REV\": \"106e0451d408ba763eadcce5bbf5205332f42cfb\"};\n" +
"        });\n" +
"        define(\"modules/constants/ajax_strings\", [], function() {\n" +
"            return {\"PROBLEM_COMPLETING_REQUEST\": \"There was a problem completing this request.\", \"STILL_WORKING\": \"Still working...\"};\n" +
"        });\n" +
"        define(\"modules/constants/debug\", [], function() {\n" +
"            return {\"CPROFILE_PARAMETER\": \"\", \"STORMCROW_PANEL\": 0, \"CPROFILE_ENABLED\": 0};\n" +
"        });\n" +
"        define(\"modules/constants/viewer\", [], function() {\n" +
"            return {\"root_ns_id\": 1314379973, \"prompt_ha_hiding\": true, \"PERSONAL_ROLE_STRING\": \"Personal\", \"LOCALE\": \"EG\", \"_viewer_properties\": {\"display_name\": \"Ehab Adel\", \"can_moderate_comments\": false, \"deprecated_first_user_in_the_cookie_id\": 606397771, \"is_reseller_session\": false, \"is_team_assume_user_session\": false, \"is_assume_user_session\": false, \"_user_data\": [{\"account_id\": \"dbid:AAALhTb_teo0GCEXI4x9h--Dvxqj0RaVJN8\", \"initials_url\": \"https://ac.dropboxstatic.com/account_photo/get_initials?initials=EA\\u0026size=128x128\\u0026vers=0\", \"is_cdm_member\": false, \"nid\": \"01474385711855172789\", \"is_dropbox_admin\": false, \"paid\": 0, \"is_team_admin\": false, \"root_ns_id\": 1314379973, \"has_never_set_password\": false, \"id\": 606397771, \"photo_url\": null, \"sso_required\": false, \"display_name\": \"Ehab Adel\", \"_authed\": true, \"familiar_name\": \"Ehab\", \"home_ns_id\": 1314379973, \"lname\": \"Adel\", \"is_team\": 0, \"role\": \"personal\", \"photo_circle_url\": null, \"fname\": \"Ehab\", \"cdm_path\": \"\", \"email\": \"pipo.adel87@gmail.com\", \"is_email_verified\": true}]}, \"DEFAULT_ROOT_NAME\": \"Dropbox\"};\n" +
"        });\n" +
"        define(\"modules/constants/env\", [], function() {\n" +
"            return {\"PROF_SHARING_WEBSERVER\": \"collections.dropbox.com\", \"LIVE_TRANSCODE_SERVER\": \"showbox-tr.dropbox.com\", \"STATIC_CONTENT_HOST\": \"cfl.dropboxstatic.com\", \"BATCH_THUMB_ENDPOINTS\": [\"//photos-1.dropbox.com/btjb\", \"//photos-2.dropbox.com/btjb\", \"//photos-3.dropbox.com/btjb\", \"//photos-4.dropbox.com/btjb\", \"//photos-5.dropbox.com/btjb\", \"//photos-6.dropbox.com/btjb\"], \"NOTES_WEBSERVER\": \"paper.dropbox.com\", \"REDIRECT_SAFE_ORIGINS\": [\"www.dropbox.com\", \"dropbox.com\", \"api.dropboxapi.com\", \"api.dropbox.com\", \"linux.dropbox.com\", \"photos.dropbox.com\", \"carousel.dropbox.com\", \"client-web.dropbox.com\", \"www.dropbox.com\", \"paper.dropbox.com\", \"notes.dropbox.com\", \"test.composer.dropbox.com\", \"collections.dropbox.com\"]};\n" +
"        });\n" +
"        define(\"modules/constants/request\", [], function() {\n" +
"                var o = {\"REQUEST_START_TIME\": 1500117920745, \"LOGGED_OUT_X_DROPBOX_UID\": -1, \"REQUEST_ID\": \"c2caf7bb4678826090e6900f1e3a28a4\", \"REQUEST_TRACING_ENABLED\": false, \"IS_HTTP2\": true};\n" +
"                /* global: ensemble is global for maestro pages */\n" +
"                if (window.ensemble && window.ensemble.getRequestId) {\n" +
"                    o.REQUEST_ID = ensemble.getRequestId();\n" +
"                }\n" +
"                return o;\n" +
"            });\n" +
"            define(\"modules/constants/webtiming\", [], function() {\n" +
"            return {\"LOG_REACT_PERF_TIMING\": true, \"LOG_TIMING_DELAY\": false, \"LOG_JS_MODULE_TIMING\": true, \"LOG_REACT_CMP_LOAD_TIMING\": true, \"LOG_BROWSER_PERFORMANCE_INFO\": true, \"LOG_RESOURCE_TIMING\": false};\n" +
"        });\n" +
"        </script><script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">\n" +
"                /* global: configureRequire comes from the\n" +
"                   fake_require_snippet (ui/page/script_tags.py) */\n" +
"                configureRequire({\"waitSeconds\": 30, \"map\": {\"external/jquery_security_patch_bundle\": {\"jquery\": \"jquery\", \"__real_jquery\": \"jquery\"}, \"*\": {\"external/react-dnd-scrollzone\": \"external/react-dnd-scrollzone-3.0.0\", \"external/reselect\": \"Reselect\", \"external/react-dnd\": \"external/react-dnd-2.1.4\", \"external/tslib\": \"tslib\", \"langpack\": \"json_loader!compiled/js/langpack/en.json\", \"external/immutable\": \"external/immutable-3\", \"external/redux-thunk\": \"external/redux-thunk-2.1.0\", \"external/react-dom/server\": \"external/react-dom/server-15.5.4-prod\", \"external/sjcl\": \"external/sjcl-1.0.3\", \"__real_jquery\": \"jquery\", \"external/videojs/video\": \"external/videojs/video-5.10.7\", \"external/history\": \"external/history-3.3.0\", \"external/react\": \"external/react-15.5.4-prod\", \"external/react-redux\": \"external/react-redux-3.1.0\", \"external/react-router\": \"external/react-router-2.0.0\", \"external/moment\": \"moment\", \"external/react-dom/test-utils\": \"external/react-dom/test-utils-shim\", \"external/react-dom\": \"external/react-dom-15.5.4-prod\", \"external/reflux\": \"external/reflux-0.3.0\", \"__real_external/tracekit\": \"TraceKit\", \"react\": \"external/react-15.5.4-prod\", \"TraceKit\": \"modules/shims/tracekit\", \"external/tracekit\": \"modules/shims/tracekit\", \"jquery\": \"external/jquery_security_patch_bundle\", \"external/jquery\": \"external/jquery_security_patch_bundle\", \"external/underscore\": \"underscore\", \"react-dom\": \"external/react-dom-15.5.4-prod\", \"external/typeahead.jquery\": \"typeahead.jquery\", \"external/classnames\": \"classnames\", \"external/react-dnd-html5-backend\": \"external/react-dnd-html5-backend-2.1.2\", \"external/bloodhound\": \"bloodhound\", \"external/redux\": \"external/redux-3.6.0-prod\", \"redux\": \"external/redux-3.6.0-prod\"}, \"modules/shims/tracekit\": {\"external/tracekit\": \"TraceKit\", \"__real_external/tracekit\": \"TraceKit\"}}, \"shim\": {\"dropins_sdk_v2\": {\"exports\": \"Dropbox\", \"deps\": []}}, \"bundles\": {\"pkg-xhr-client\": [\"modules/core/xhr\", \"modules/core/cookies\"], \"pkg-coreui\": [\"modules/core/controller_registry\", \"modules/clean/dbmodal\", \"modules/clean/react/button\", \"modules/core/controller_helpers\", \"modules/clean/react/css\", \"modules/clean/react/image\"], \"pkg-i18n\": [\"modules/core/i18n\"], \"pkg-coreui-with-i18n\": [\"modules/clean/avatar/style\", \"modules/clean/avatar/size\", \"modules/clean/react/modal\", \"modules/clean/avatar/photo_avatar\", \"modules/clean/avatar/viewer_avatar\"], \"pkg-react-15.5.4-prod\": [\"external/react-dom-15.5.4-prod\", \"external/react-15.5.4-prod\"], \"pkg-sharing\": [\"modules/clean/avatar/faceholder\"], \"pkg-misc\": [\"modules/clean/legacy_pyxl_controllers/bubble_dropdown\"], \"pkg-legacy-ai\": [\"modules/clean/photo_upload/controller\", \"modules/clean/account_photo_modal/mode_enum\", \"modules/clean/account_photo_modal/ui\", \"modules/clean/photo_upload/ui\", \"modules/clean/photo_upload/mode_enum\", \"modules/clean/account_photo_modal/controller\"], \"pkg-external\": [\"underscore\", \"external/hoist-non-react-statics\", \"tslib\", \"classnames\"], \"pkg-legacy-bm\": [\"modules/clean/api/connect_v3\", \"modules/clean/api/display_token\"], \"pkg-core\": [\"modules/core/uri\", \"modules/clean/js_client_stopwatch\", \"modules/clean/devtools/perf_hub_actions\", \"modules/clean/devtools/perf_hub_action_types\", \"modules/clean/ajax\", \"modules/core/notify\", \"modules/clean/js_basic_stopwatch\", \"modules/clean/storage\", \"modules/clean/job_progress\", \"modules/core/accessible_announce\", \"modules/clean/event_handler\", \"modules/clean/event_load\", \"modules/clean/css\", \"modules/clean/stormcrow/stormcrow_panel_action_types\", \"modules/clean/viewer\", \"modules/clean/accessibility/utils\", \"modules/clean/undo\", \"modules/clean/loggers/cache_logger\", \"modules/clean/js_environment\", \"modules/clean/user\", \"modules/clean/keycode\", \"modules/clean/react_perf_logger\", \"modules/clean/react_logger\", \"modules/clean/web_module_timing\", \"modules/clean/flux/dispatcher\", \"modules/clean/stormcrow/stormcrow_panel_actions\", \"modules/core/dom\", \"modules/clean/loggers/pagelet_perf\", \"modules/clean/analytics\", \"modules/core/browser\", \"modules/clean/web_timing_logger\", \"modules/core/html\", \"modules/clean/static_urls\"], \"pkg-exception-reporting\": [\"modules/core/exception_tag_registry\", \"TraceKit\", \"modules/shims/tracekit\", \"modules/pagelet_config\", \"modules/core/exception\"], \"pkg-file_viewer\": [\"modules/clean/multiaccount_login\", \"modules/clean/teams/team_assume_user_personal_locked_modal\"], \"pkg-legacy-ag\": [\"modules/clean/account_photo_modal/account_header\"], \"pkg-legacy-ab\": [\"modules/clean/legacy_ui_button\", \"modules/clean/hi_res\"]}, \"baseUrl\": \"https://cfl.dropboxstatic.com/static/\", \"paths\": {\"pkg-xhr-client\": \"compiled/js/packaged/pkg-xhr-client.min-vflrP3egN\", \"pkg-coreui\": \"compiled/js/packaged/pkg-coreui.min-vflZnrPKA\", \"pkg-react-15.5.4-prod\": \"compiled/js/packaged/pkg-react-15.5.4-prod.min-vfldfc2Jm\", \"pkg-legacy-ai\": \"compiled/js/packaged/pkg-legacy-ai.min-vfltgfDc3\", \"pkg-legacy-ag\": \"compiled/js/packaged/pkg-legacy-ag.min-vflz_I-c_\", \"pkg-legacy-ab\": \"compiled/js/packaged/pkg-legacy-ab.min-vflF07927\", \"pkg-i18n\": \"compiled/js/packaged/pkg-i18n.min-vflRSih2V\", \"pkg-sharing\": \"compiled/js/packaged/pkg-sharing.min-vflB8rUl7\", \"pkg-core\": \"compiled/js/packaged/pkg-core.min-vflZsgSu0\", \"pkg-external\": \"compiled/js/packaged/pkg-external.min-vfl0H3VlI\", \"external/flux\": \"compiled/js/external/flux.min-vfl1cbEhF\", \"external/moxie\": \"compiled/js/external/moxie.min-vflBUG7Sb\", \"external/plupload_dev\": \"compiled/js/external/plupload_dev.min-vfl8WLI7m\", \"external/keymaster\": \"compiled/js/external/keymaster.min-vflXcT0pH\", \"pkg-misc\": \"compiled/js/packaged/pkg-misc.min-vflu_IrS_\", \"dropins_sdk_v2\": \"compiled/js/dropins_sdk_v2.min-vflMD2OZ4\", \"pkg-legacy-bm\": \"compiled/js/packaged/pkg-legacy-bm.min-vfloAFGXu\", \"pkg-exception-reporting\": \"compiled/js/packaged/pkg-exception-reporting.min-vflOiJrc6\", \"external/jquery_security_patch_bundle\": \"compiled/js/external/jquery_security_patch_bundle.min-vflZgbyZQ\", \"recaptcha\": \"https://google.com/recaptcha/api.js?render=explicit\", \"compiled/js/langpack/en.json\": \"compiled/js/langpack/en.json?17361\", \"pkg-coreui-with-i18n\": \"compiled/js/packaged/pkg-coreui-with-i18n.min-vflbwqL11\", \"external/purify\": \"compiled/js/external/purify.min-vflPgMw7P\", \"external/sha1\": \"compiled/js/external/sha1.min-vflnBGgMP\", \"langpack/en\": \"compiled/js/langpack/en.js?17361\", \"pkg-file_viewer\": \"compiled/js/packaged/pkg-file_viewer.min-vfl4PQMrN\"}}, {\"reusingContext\": false, \"reusingJquery\": false, \"deferJsTimeout\": null, \"requireFallbackBaseUrl\": \"https://www.dropboxstatic.com/static/\", \"deferJs\": false}, [[[[\"modules/clean/account_photo_modal/account_header\"], (function(mod){\n" +
"mod.initialize_module({\"open_modal_button_selector\": \"#pyxl6745217937062813470\", \"add_photo_link_selector\": \"#pyxl6745217937062813471\", \"hide_add_photo_link_class\": \"u-l-dn\"});\n" +
"})],[[\"modules/clean/api/connect_v3\", \"modules/clean/viewer\", \"modules/clean/user\", \"modules/constants/viewer\", \"modules/clean/api/display_token\"], (function(ConnectPage){\n" +
"ConnectPage.init();;\n" +
"})],[[\"modules/clean/avatar/faceholder\", \"external/react\", \"external/react-dom\", \"modules/clean/avatar/viewer_avatar\"], (function(default_avatar,React,ReactDOM,avatar){\n" +
"\n" +
"              var container_element = document.getElementById(\"pyxl6745217937062813475\");\n" +
"              var viewer_props = {\"optionalClass\": \"\", \"shape\": \"CIRCLE\", \"dimension\": 32, \"photoUrl\": null};\n" +
"              viewer_props.defaultAvatar = React.createElement(default_avatar, {\"optionalClass\": \"\", \"dimension\": 32});\n" +
"              ReactDOM.render(React.createElement(avatar, viewer_props), container_element);\n" +
"            ;\n" +
"})],[[\"modules/clean/avatar/faceholder\", \"external/react\", \"external/react-dom\", \"modules/clean/avatar/viewer_avatar\", \"modules/clean/accessibility/utils\", \"modules/clean/css\", \"modules/clean/avatar/photo_avatar\", \"modules/clean/avatar/style\", \"react\", \"modules/core/uri\", \"modules/clean/event_handler\", \"external/classnames\", \"modules/clean/static_urls\", \"modules/clean/avatar/size\", \"react-dom\", \"modules/constants/env\", \"modules/clean/react/image\"], (function(default_avatar,React,ReactDOM,avatar){\n" +
"\n" +
"              var container_element = document.getElementById(\"pyxl6745217937062813473\");\n" +
"              var viewer_props = {\"optionalClass\": \"u-mar-right-xs account-header__avatar\", \"shape\": \"CIRCLE\", \"dimension\": 24, \"photoUrl\": null};\n" +
"              viewer_props.defaultAvatar = React.createElement(default_avatar, {\"optionalClass\": \"u-mar-right-xs account-header__avatar\", \"dimension\": 24});\n" +
"              ReactDOM.render(React.createElement(avatar, viewer_props), container_element);\n" +
"            ;\n" +
"})],[[\"modules/clean/legacy_pyxl_controllers/bubble_dropdown\", \"modules/clean/hi_res\", \"modules/core/controller_registry\", \"jquery\", \"modules/core/exception_tag_registry\", \"modules/core/exception\", \"modules/pagelet_config\", \"modules/core/dom\", \"modules/constants/page_load\", \"external/tslib\", \"external/underscore\", \"__real_external/tracekit\", \"TraceKit\", \"modules/core/xhr\", \"modules/clean/keycode\", \"modules/core/cookies\"], (function(modules__clean__legacy_pyxl_controllers__bubble_dropdown,modules__clean__hi_res,modules__core__controller_registry){\n" +
"(function (modules__clean__hi_res, ControllerRegistry) { ControllerRegistry.register_controller(\"component6745217937062813476\", modules__clean__hi_res, []); })(modules__clean__hi_res, modules__core__controller_registry);\n" +
"(function (modules__clean__hi_res, ControllerRegistry) { ControllerRegistry.register_controller(\"component6745217937062813474\", modules__clean__hi_res, []); })(modules__clean__hi_res, modules__core__controller_registry);\n" +
"(function (modules__clean__legacy_pyxl_controllers__bubble_dropdown, ControllerRegistry) { ControllerRegistry.register_controller(\"component6745217937062813472\", modules__clean__legacy_pyxl_controllers__bubble_dropdown, [\"top\", null, null, null, null, null]); })(modules__clean__legacy_pyxl_controllers__bubble_dropdown, modules__core__controller_registry);\n" +
"(function (modules__clean__hi_res, ControllerRegistry) { ControllerRegistry.register_controller(\"component6745217937062813469\", modules__clean__hi_res, []); })(modules__clean__hi_res, modules__core__controller_registry);\n" +
"})],[[\"modules/clean/legacy_ui_button\"], (function(initUIButtons){\n" +
"initUIButtons();;\n" +
"})]]]);\n" +
"                </script><img src=\"https://dropbox.com/hstsping\" alt=\"\" style=\"display:none;\" /><script type=\"text/javascript\" nonce=\"pX3wcD9zX8Q9FSNP9KBL\">\n" +
"        document.addEventListener('DOMContentLoaded', function () {\n" +
"                var metaTag = document.createElement('meta');\n" +
"                    metaTag.setAttribute('http-equiv', 'Content-Security-Policy');\n" +
"                    metaTag.setAttribute('content', \"script-src https: 'unsafe-eval' https://cfl.dropboxstatic.com/static/compiled/js/ https://www.dropboxstatic.com/static/compiled/js/ https://cfl.dropboxstatic.com/static/javascript/ https://www.dropboxstatic.com/static/javascript/; worker-src blob:\");\n" +
"                    document.head.appendChild(metaTag);\n" +
"        });</script><div id=\"accessible-announce\" class=\"ax-visually-hidden\" aria-live=\"assertive\"></div></body></html>";
      
      
      //----------------------------------------------------
      
      String source = " </DIV>\n" +
"        </DIV>  <DIV id=\"auth\" class=\"auth-connect-frame auth-connect-frame--standard\">\n" +
"            <DIV>\n" +
"                <IMG src=\"https://cfl.dropboxstatic.com/static/images/default_app_icon-vflohrH6B.png\" alt=\"\" id=\"app-icon\"/>\n" +
"            </DIV>\n" +
"            <DIV id=\"auth-text\">\n" +
"                <DIV>Enter this code into <SPAN class=\"app-name\">testSync1984</SPAN> to finish the process.</DIV>\n" +
"                <DIV id=\"auth-code\">\n" +
"                    <INPUT type=\"text\" data-token=\"j1giBWExI0AAAAAAAAAAMG4n5KnqHZhOC-BEG4G1E_c\" readonly=\"readonly\" class=\"auth-box\" spellcheck=\"false\"/>\n" +
"                </DIV>\n" +
"            </DIV>\n" +
"        </DIV>  <SCRIPT type=\"text/javascript\" nonce=\"WwSaQHDFzmmTszcpX7LZ\">define(\"modules/constants/dropins\", [], function() {\n" +
"            return {\"CHOOSER_APP_KEY\": \"a1gk45gxjylc840\"};\n" +
"        });\n" +
"        define(\"modules/constants/undo_strings\", [], function() {\n" +
"            return {\"UNDO\": \"Undo\"};";
      
      String firstSplit = "data-token=\"";
    
      String lastSplit = "\"";
      
      String[] s1 = source.split(firstSplit);
          
          String[] s2 = s1[1].split(lastSplit);
          
          String key = s2[0].replaceAll("\"", "");
          
              System.out.println(key);
              
             // WebBrowser.setKey(key);
      
    }
    
}
