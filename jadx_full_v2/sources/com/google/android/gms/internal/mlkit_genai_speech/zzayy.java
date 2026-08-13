            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ServiceConfigurationError;
            import java.util.ServiceLoader;
            
            final class zzayy {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ServiceLoader] */
                /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ServiceLoader] */
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
                public static List zza(Class cls, Iterable iterable, ClassLoader classLoader, zzayx zzayxVar) {
                    ?? Load;
/* 5 */             if (zzb(classLoader)) {
/* 9 */                 Load = new ArrayList();
/* 12 */                Iterator it = iterable.iterator();
/* 20 */                while (it.hasNext()) {
/* 26 */                    Class cls2 = (Class) it.next();
/* 28 */                    Object objNewInstance = null;
                            try {
/* 37 */                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                            } catch (ClassCastException unused) {
                            } catch (Throwable th) {
/* 62 */                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                            }
/* 63 */                    if (objNewInstance != null) {
/* 65 */                        Load.add(objNewInstance);
                            }
                        }
                    } else {
/* 69 */                Load = ServiceLoader.load(cls, classLoader);
/* 81 */                if (!Load.iterator().hasNext()) {
/* 83 */                    Load = ServiceLoader.load(cls);
                        }
                    }
/* 89 */            ArrayList arrayList = new ArrayList();
/* 100 */           for (Object obj : Load) {
/* 106 */               zzayxVar.zzb(obj);
/* 109 */               arrayList.add(obj);
                    }
/* 122 */           Collections.sort(arrayList, Collections.reverseOrder(new zzayw(zzayxVar)));
/* 125 */           return Collections.unmodifiableList(arrayList);
                }

                public static boolean zzb(ClassLoader classLoader) throws ClassNotFoundException {
                    try {
/* 4 */                 Class.forName("android.app.Application", false, classLoader);
/* 7 */                 return true;
                    } catch (Exception unused) {
/* 1 */                 return false;
                    }
                }
            }
