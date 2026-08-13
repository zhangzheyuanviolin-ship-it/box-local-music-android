            package p000;

            import java.util.Map;
            
            public abstract class loio01lO extends llOl001olOi {
                public final lol0ll0lioo I00000oIO;

                public loio01lO(lol0ll0lioo lol0ll0liooVar) {
/* 4 */             this.I00000oIO = lol0ll0liooVar;
                }

                @Override
                public final Object I00000oIO(o0IlOioo o0iloioo) {
/* 8 */             if (o0iloioo.I00ooIo0() == 9) {
/* 10 */                o0iloioo.I00lli11();
/* 7 */                 return null;
                    }
/* 14 */            Object objI0000Il00O = I0000Il00O();
/* 20 */            Map map = this.I00000oIO.I00000oIO;
                    try {
/* 22 */                o0iloioo.I00OIl();
/* 29 */                while (o0iloioo.I00Ol00()) {
/* 39 */                    loill0OOio loill0ooio = (loill0OOio) map.get(o0iloioo.I00iiI());
/* 41 */                    if (loill0ooio == null) {
/* 43 */                        o0iloioo.I00oliIiO01i();
                            } else {
/* 49 */                        I0000O(objI0000Il00O, o0iloioo, loill0ooio);
                            }
                        }
/* 53 */                o0iloioo.I00OOll1();
/* 56 */                return I0000oI00(objI0000Il00O);
                    } catch (IllegalAccessException e) {
/* 61 */                ll1I00l ll1i00l = o01l0i.I00000oIO;
/* 65 */                OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 7 */                 return null;
                    } catch (IllegalStateException e2) {
/* 77 */                throw new llO11IolIO(e2, 25);
                    }
                }

                public abstract Object I0000Il00O();

                public abstract void I0000O(Object obj, o0IlOioo o0iloioo, loill0OOio loill0ooio);

                public abstract Object I0000oI00(Object obj);
            }
