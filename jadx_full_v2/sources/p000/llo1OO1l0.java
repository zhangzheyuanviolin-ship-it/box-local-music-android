            package p000;

            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class llo1OO1l0 extends llOl001olOi {
                public volatile llOl001olOi I00000oIO;
                public boolean I00000oOI;
                public I1ii1o0 I0000Il00O;
                public o0IOi0io1iOo I0000O;
                public lloI11II0o0 I0000oI00;

                /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
                
                    r11.I00000oIO = r0;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0087 A[SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(o0IlOioo o0iloioo) {
                    Iterator it;
/* 4 */             if (this.I00000oOI) {
/* 164 */               o0iloioo.I00oliIiO01i();
/* 3 */                 return null;
                    }
/* 6 */             llOl001olOi llol001oloiI00O0i0ii = this.I00000oIO;
/* 8 */             if (llol001oloiI00O0i0ii == null) {
/* 10 */                I1ii1o0 i1ii1o0 = this.I0000Il00O;
/* 12 */                lloI11II0o0 lloi11ii0o0 = this.I0000oI00;
/* 14 */                o0IOi0io1iOo o0ioi0io1ioo = this.I0000O;
/* 18 */                o00010OI0o o00010oi0o = (o00010OI0o) i1ii1o0.I00ilI0I1;
/* 20 */                o00010oi0o.getClass();
/* 25 */                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o00010oi0o.I00iiO;
/* 30 */                if (lloi11ii0o0 == o00010OI0o.I00iio) {
/* 100 */                   lloi11ii0o0 = o00010oi0o;
/* 105 */                   it = ((List) i1ii1o0.I00ilO0).iterator();
/* 109 */                   boolean z = false;
                            while (true) {
/* 114 */                       if (it.hasNext()) {
/* 120 */                           llOo0OilI lloo0oili = (llOo0OilI) it.next();
/* 122 */                           if (z) {
/* 128 */                               llOl001olOi llol001oloiI00000oIO = lloo0oili.I00000oIO(i1ii1o0, o0ioi0io1ioo);
/* 132 */                               if (llol001oloiI00000oIO != null) {
/* 134 */                                   llol001oloiI00O0i0ii = llol001oloiI00000oIO;
                                            break;
                                        }
                                    } else if (lloo0oili == lloi11ii0o0) {
/* 126 */                               z = true;
                                    }
                                } else {
/* 136 */                           if (z) {
/* 155 */                               I000II.I000iOII("GSON cannot serialize or deserialize ".concat(String.valueOf(o0ioi0io1ioo)));
/* 3 */                                 return null;
                                    }
/* 138 */                           llol001oloiI00O0i0ii = i1ii1o0.I00O0i0ii(o0ioi0io1ioo);
                                }
                            }
                        } else {
/* 33 */                    Class cls = o0ioi0io1ioo.I00000oIO;
/* 39 */                    llOo0OilI lloo0oili2 = (llOo0OilI) concurrentHashMap.get(cls);
/* 41 */                    if (lloo0oili2 != null) {
/* 43 */                        if (lloo0oili2 == lloi11ii0o0) {
                                }
/* 105 */                       it = ((List) i1ii1o0.I00ilO0).iterator();
/* 109 */                       boolean z2 = false;
                                while (true) {
/* 114 */                           if (it.hasNext()) {
                                    }
                                }
                            } else {
/* 52 */                        lli010l0ii lli010l0iiVar = (lli010l0ii) cls.getAnnotation(lli010l0ii.class);
/* 54 */                        if (lli010l0iiVar != null) {
/* 57 */                            Class clsZza = lli010l0iiVar.zza();
/* 67 */                            if (llOo0OilI.class.isAssignableFrom(clsZza)) {
/* 87 */                                llOo0OilI lloo0oili3 = (llOo0OilI) ((i0O1lIi1O0IO) o00010oi0o.I00iiI).I0000O(new o0IOi0io1iOo(clsZza), true).zza();
/* 93 */                                llOo0OilI lloo0oili4 = (llOo0OilI) concurrentHashMap.putIfAbsent(cls, lloo0oili3);
/* 95 */                                if (lloo0oili4 != null) {
/* 97 */                                    lloo0oili3 = lloo0oili4;
                                        }
/* 98 */                                if (lloo0oili3 == lloi11ii0o0) {
                                        }
                                    }
                                }
/* 105 */                       it = ((List) i1ii1o0.I00ilO0).iterator();
/* 109 */                       boolean z22 = false;
                                while (true) {
/* 114 */                           if (it.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
/* 159 */           return llol001oloiI00O0i0ii.I00000oIO(o0iloioo);
                }
            }
