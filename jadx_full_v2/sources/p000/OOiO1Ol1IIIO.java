            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            
            public final class OOiO1Ol1IIIO implements OIi0Oi1lOoo {
                public Context I00iOIl;
                public boolean I00iiI;

                @Override
                public final void I0001Ioi1lo(Object obj) {
/* 1 */             Context context = this.I00iOIl;
/* 3 */             boolean z = this.I00iiI;
/* 11 */            SharedPreferences.Editor editorEdit = lIi0lOOo10.I00000oIO(context).edit();
/* 17 */            editorEdit.putBoolean("proxy_retention", z);
/* 20 */            editorEdit.apply();
                }
            }
