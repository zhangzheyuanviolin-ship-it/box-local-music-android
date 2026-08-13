            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ShortcutInfo;
            import android.content.pm.ShortcutManager;
            import android.graphics.drawable.Icon;
            import android.net.Uri;
            import com.box.gallery.MainActivity;
            import com.box.gallery.R;
            
            public abstract class lOIIilOlOl0i {
                public static void I00000oIO(Context context) {
/* 7 */             ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
/* 9 */             if (shortcutManager == null || shortcutManager.isRateLimitingActive()) {
/* 18 */                return;
                    }
/* 147 */           shortcutManager.setDynamicShortcuts(IOOi1I.I000O01llI0(new ShortcutInfo.Builder(context, "shortcut_ai_chat").setShortLabel("Chat").setLongLabel("Open Chat").setIcon(Icon.createWithResource(context, R.drawable.ic_shortcut_chat)).setIntent(new Intent("android.intent.action.VIEW", Uri.parse("com.box.gallery://shortcut/llm_chat")).setClass(context, MainActivity.class)).setRank(0).build(), new ShortcutInfo.Builder(context, "shortcut_box_assist").setShortLabel("Box Assist").setLongLabel("Open Box Assist").setIcon(Icon.createWithResource(context, R.drawable.ic_shortcut_assist)).setIntent(new Intent("android.intent.action.VIEW", Uri.parse("com.box.gallery://shortcut/box_assist")).setClass(context, MainActivity.class)).setRank(1).build()));
                }
            }
