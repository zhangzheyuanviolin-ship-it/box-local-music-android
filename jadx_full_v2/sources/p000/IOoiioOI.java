            package p000;

            import android.content.Context;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.Objects;
            
            public abstract class IOoiioOI {
                public static final Object I00000oIO = new Object();
                public static final HashMap I00000oOI = new HashMap();

                public static Context I00000oIO(Context context) {
                    Context context2;
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 9 */             int iHashCode = context.getApplicationContext().hashCode();
/* 13 */            int deviceId = context.getDeviceId();
/* 35 */            String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(deviceId), context.getAttributionTag());
                    synchronized (I00000oIO) {
                        try {
/* 42 */                    HashMap map = I00000oOI;
/* 48 */                    WeakReference weakReference = (WeakReference) map.get(str);
/* 50 */                    if (weakReference == null) {
/* 64 */                        context2 = null;
                            } else {
/* 56 */                        context2 = (Context) weakReference.get();
/* 58 */                        if (context2 == null) {
/* 61 */                            map.remove(str);
/* 64 */                            context2 = null;
                                }
                            }
/* 65 */                    if (context2 != null) {
/* 68 */                        return context2;
                            }
/* 75 */                    Context contextCreateDeviceContext = applicationContext.createDeviceContext(context.getDeviceId());
/* 79 */                    String attributionTag = context.getAttributionTag();
/* 91 */                    if (!Objects.equals(attributionTag, contextCreateDeviceContext.getAttributionTag())) {
/* 93 */                        contextCreateDeviceContext = contextCreateDeviceContext.createAttributionContext(attributionTag);
                            }
/* 102 */                   map.put(str, new WeakReference(contextCreateDeviceContext));
/* 106 */                   return contextCreateDeviceContext;
                        } finally {
                        }
                    }
                }
            }
