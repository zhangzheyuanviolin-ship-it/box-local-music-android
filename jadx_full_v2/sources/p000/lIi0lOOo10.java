            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            
            public abstract class lIi0lOOo10 {
                public static SharedPreferences I00000oIO(Context context) {
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 5 */             if (applicationContext != null) {
/* 8 */                 context = applicationContext;
                    }
/* 12 */            return context.getSharedPreferences("com.google.firebase.messaging", 0);
                }
            }
