            package p000;

            import android.util.Log;
            
            public abstract class lIo0011lo {
                public static final boolean I00000oIO(String str, IllOOo00lI illOOo00lI) {
                    try {
/* 9 */                 boolean zBooleanValue = ((Boolean) illOOo00lI.invoke()).booleanValue();
/* 13 */                if (!zBooleanValue) {
/* 15 */                    Log.e("ReflectionGuard", str);
                        }
/* 18 */                return zBooleanValue;
                    } catch (ClassNotFoundException unused) {
/* 45 */                Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
/* 48 */                return false;
                    } catch (NoSuchFieldException unused2) {
/* 25 */                Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
/* 48 */                return false;
                    } catch (NoSuchMethodException unused3) {
/* 35 */                Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
/* 48 */                return false;
                    }
                }
            }
