            package net.openid.appauth;

            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import p000.I11io0O0O1o1;
            
            public class RedirectUriReceiverActivity extends I11io0O0O1o1 {
                @Override
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 8 */             Uri data = getIntent().getData();
/* 16 */            Intent intent = new Intent(this, (Class<?>) AuthorizationManagementActivity.class);
/* 19 */            intent.setData(data);
/* 24 */            intent.addFlags(603979776);
/* 27 */            startActivity(intent);
/* 30 */            finish();
                }
            }
