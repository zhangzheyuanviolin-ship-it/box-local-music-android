            package p000;

            import java.util.HashMap;
            import java.util.Map;
            
            public abstract class O0l10o00l {
                private final Map zza = new HashMap();

                public abstract Object create(Object obj);

                public Object get(Object obj) {
                    synchronized (this.zza) {
                        try {
/* 10 */                    if (this.zza.containsKey(obj)) {
/* 14 */                        return this.zza.get(obj);
                            }
/* 22 */                    Object objCreate = create(obj);
/* 28 */                    this.zza.put(obj, objCreate);
/* 32 */                    return objCreate;
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }
            }
