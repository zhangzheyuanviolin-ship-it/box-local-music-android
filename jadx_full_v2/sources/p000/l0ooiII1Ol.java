            package p000;

            import android.net.Uri;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Callable;
            import java.util.logging.Level;
            
            public final class l0ooiII1Ol implements Callable {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public l0ooiII1Ol(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() throws Throwable {
                    switch (this.I00000oIO) {
                        case 0:
/* 174 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00000oOI).I000II;
/* 176 */                   lilool0.I00OI1();
/* 179 */                   iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 181 */                   lilOOl0.I00O0o1oo(iol1loo1io);
                            break;
                        case 1:
/* 149 */                   lilOOl0 lilool02 = ((l1Oli1l) this.I00000oOI).I000II;
/* 151 */                   lilool02.I00OI1();
                            break;
                        case 2:
/* 86 */                    lli10iI lli10ii = (lli10iI) this.I0000Il00O;
/* 88 */                    String str = lli10ii.I00iOIl;
/* 90 */                    lII0I0I000I.I000II(str);
/* 95 */                    lilOOl0 lilool03 = (lilOOl0) this.I00000oOI;
/* 97 */                    l1ioIO011Oo l1ioio011ooI00000oIO = lilool03.I00000oIO(str);
/* 101 */                   l1iioiool l1iioioolVar = l1iioiool.ANALYTICS_STORAGE;
/* 107 */                   if (!l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar) || !l1ioIO011Oo.I0000Il00O(100, lli10ii.I00oII).I000OOo1O(l1iioioolVar)) {
/* 141 */                       lilool03.I00II0oii1o().I00lll10.I00000oOI("Analytics storage consent denied. Returning null app instance id");
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
/* 9 */                     l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) this.I0000Il00O;
/* 13 */                    llOOiIiIOo llooiiiioo = (llOOiIiIOo) this.I00000oOI;
/* 17 */                    lIlIo1 lilio1 = (lIlIo1) l1il1ilioi1l.I00iOIl;
/* 23 */                    OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(13);
                            try {
/* 32 */                        lloOo1iol llooo1iol = (lloOo1iol) lilio1.I0001Ioi1lo.get();
/* 36 */                        Uri uri = (Uri) l1il1ilioi1l.I00iiI;
/* 42 */                        i000IO i000io = new i000IO(12);
/* 45 */                        i000io.I00iiI = llooiiiioo;
/* 47 */                        VarHandle.storeStoreFence();
/* 54 */                        i000io.I00iiO = new OoOlO1O0o[]{ooOlO1O0o};
                                break;
                            } catch (IOException | RuntimeException e) {
/* 80 */                        ll0ii0IllI.I00000oIO(Level.WARNING, lilio1.I00000oIO(), e, "Failed to update snapshot for %s flags may be stale.", (String) l1il1ilioi1l.I00iiO);
                                break;
                            }
                    }
/* 3 */             return null;
                }
            }
