            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import java.lang.invoke.VarHandle;
            import java.util.Objects;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.logging.Logger;
            
            public final class IOoi01o {
                public Object I00000oIO;
                public volatile Object I00000oOI;

                public Logger I00000oIO() {
/* 3 */             Logger logger = (Logger) this.I00000oOI;
/* 5 */             if (logger != null) {
/* 7 */                 return logger;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    Logger logger2 = (Logger) this.I00000oOI;
/* 13 */                    if (logger2 != null) {
/* 16 */                        return logger2;
                            }
/* 23 */                    Logger logger3 = Logger.getLogger((String) this.I00000oIO);
/* 27 */                    this.I00000oOI = logger3;
/* 30 */                    return logger3;
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                public lili0I0IOO0 I00000oOI(lIlIo1 lilio1) {
/* 3 */             liIli0ooIlO liili0ooilo = (liIli0ooIlO) this.I00000oOI;
/* 5 */             liIli0ooIlO liili0ooilo2 = lili0I0IOO0.I000OiO;
/* 7 */             if (liili0ooilo != liili0ooilo2) {
/* 9 */                 Oi1ol0llI oi1ol0llI = lili0I0IOO0.I000OOo1O;
/* 11 */                oi1ol0llI.getClass();
/* 17 */                O1ilIl1l0I o1ilIl1l0I = new O1ilIl1l0I(3);
/* 21 */                o1ilIl1l0I.I00iiI = false;
/* 25 */                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) oi1ol0llI.I00iiI;
/* 27 */                Context context = lilio1.I00000oOI;
/* 29 */                String str = liili0ooilo.I0000O;
/* 31 */                if (str == null) {
/* 40 */                    str = (String) liili0ooilo.I00000oIO.apply(context);
/* 42 */                    liili0ooilo.I0000O = str;
                        }
/* 46 */                lil011O lil011o = new lil011O();
/* 49 */                lil011o.I00000oIO = lilio1;
/* 51 */                lil011o.I00000oOI = liili0ooilo;
/* 53 */                lil011o.I0000Il00O = o1ilIl1l0I;
/* 55 */                VarHandle.storeStoreFence();
/* 62 */                liIol1oO liiol1oo = (liIol1oO) concurrentHashMap.computeIfAbsent(str, lil011o);
/* 66 */                if (o1ilIl1l0I.I00iiI) {
/* 68 */                    Context context2 = lilio1.I00000oOI;
/* 73 */                    iili011O1 iili011o1 = new iili011O1(4);
/* 76 */                    iili011o1.I00iiI = oi1ol0llI;
/* 78 */                    VarHandle.storeStoreFence();
/* 83 */                    if (llIIiO1oiI0o.I00000oIO == null) {
                                synchronized (llIIiO1oiI0o.class) {
                                    try {
/* 90 */                                if (llIIiO1oiI0o.I00000oIO == null) {
/* 102 */                                   if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
/* 117 */                                       context2.registerReceiver(new llIIiO1oiI0o(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                            }
/* 123 */                                   llIIiO1oiI0o.I00000oIO = iili011o1;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
/* 131 */               this.I00000oIO = liiol1oo.I00000oIO;
/* 133 */               this.I00000oOI = liili0ooilo2;
                    }
/* 137 */           return (lili0I0IOO0) this.I00000oIO;
                }
            }
