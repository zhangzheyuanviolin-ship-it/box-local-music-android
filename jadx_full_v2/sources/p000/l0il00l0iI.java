            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            
            public final class l0il00l0iI implements Callable {
                public final int I00000oIO;
                public l0l1ol11 I00000oOI;
                public String I0000Il00O;

                public l0il00l0iI(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() throws Throwable {
                    switch (this.I00000oIO) {
                        case 0:
/* 145 */                   l0l1ol11 l0l1ol11Var = this.I00000oOI;
/* 147 */                   String str = this.I0000Il00O;
/* 150 */                   l0il00l0iI l0il00l0ii = new l0il00l0iI(1);
/* 153 */                   l0il00l0ii.I00000oOI = l0l1ol11Var;
/* 155 */                   l0il00l0ii.I0000Il00O = str;
/* 157 */                   VarHandle.storeStoreFence();
/* 163 */                   l1oo00Iio10 l1oo00iio10 = new l1oo00Iio10("internal.appMetadata", 3);
/* 166 */                   l1oo00iio10.I00iio = l0il00l0ii;
/* 168 */                   VarHandle.storeStoreFence();
/* 171 */                   return l1oo00iio10;
                        case 1:
/* 48 */                    l0l1ol11 l0l1ol11Var2 = this.I00000oOI;
/* 52 */                    iOl1lOo1IO iol1loo1io = l0l1ol11Var2.I00iiI.I00iiO;
/* 54 */                    lilOOl0.I00O0o1oo(iol1loo1io);
/* 57 */                    String str2 = this.I0000Il00O;
/* 59 */                    l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str2);
/* 65 */                    HashMap map = new HashMap();
/* 72 */                    map.put("platform", "android");
/* 77 */                    map.put("package_name", str2);
/* 86 */                    ((l0olllO1i) l0l1ol11Var2.I00iOIl).I00iio.I010l1O();
/* 98 */                    map.put("gmp_version", 161000L);
/* 101 */                   if (l0iiiiI01Ol1o0 != null) {
/* 103 */                       String strI00IoiI = l0iiiiI01Ol1o0.I00IoiI();
/* 107 */                       if (strI00IoiI != null) {
/* 111 */                           map.put("app_version", strI00IoiI);
                                }
/* 124 */                       map.put("app_version_int", Long.valueOf(l0iiiiI01Ol1o0.I00O0i0ii()));
/* 137 */                       map.put("dynamite_version", Long.valueOf(l0iiiiI01Ol1o0.I00000oOI()));
                            }
/* 140 */                   return map;
                        default:
/* 10 */                    l0l1ol11 l0l1ol11Var3 = this.I00000oOI;
/* 12 */                    String str3 = this.I0000Il00O;
/* 16 */                    i000IO i000io = new i000IO(9);
/* 19 */                    i000io.I00iiI = str3;
/* 21 */                    Objects.requireNonNull(l0l1ol11Var3);
/* 24 */                    i000io.I00iiO = l0l1ol11Var3;
/* 26 */                    VarHandle.storeStoreFence();
/* 32 */                    lOiIIOo loiiioo = new lOiIIOo("internal.remoteConfig", 0);
/* 44 */                    loiiioo.I00iiI.put("getValue", new l1oo00Iio10(loiiioo, i000io));
/* 47 */                    return loiiioo;
                    }
                }
            }
