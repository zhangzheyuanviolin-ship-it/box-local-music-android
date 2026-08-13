            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class lloI11II0o0 implements Cloneable, llOo0OilI {
                public static final lloI11II0o0 I00iiO;
                public List I00iOIl;
                public List I00iiI;

                static {
/* 3 */             lloI11II0o0 lloi11ii0o0 = new lloI11II0o0();
/* 6 */             List list = Collections.EMPTY_LIST;
/* 8 */             lloi11ii0o0.I00iOIl = list;
/* 10 */            lloi11ii0o0.I00iiI = list;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            I00iiO = lloi11ii0o0;
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) {
/* 1 */             Class cls = o0ioi0io1ioo.I00000oIO;
/* 4 */             boolean zI00000oOI = I00000oOI(cls, true);
/* 9 */             boolean zI00000oOI2 = I00000oOI(cls, false);
/* 13 */            if (!zI00000oOI && !zI00000oOI2) {
/* 17 */                return null;
                    }
/* 21 */            llo1OO1l0 llo1oo1l0 = new llo1OO1l0();
/* 24 */            llo1oo1l0.I00000oOI = zI00000oOI2;
/* 26 */            llo1oo1l0.I0000Il00O = i1ii1o0;
/* 28 */            llo1oo1l0.I0000O = o0ioi0io1ioo;
/* 30 */            llo1oo1l0.I0000oI00 = this;
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            return llo1oo1l0;
                }

                public final boolean I00000oOI(Class cls, boolean z) {
                    List list;
/* 1 */             if (z) {
/* 41 */                list = this.I00iOIl;
                    } else {
/* 9 */                 if (!Enum.class.isAssignableFrom(cls)) {
/* 11 */                    ll1I00l ll1i00l = o01l0i.I00000oIO;
/* 21 */                    if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
/* 36 */                        return true;
                            }
                        }
/* 38 */                list = this.I00iiI;
                    }
/* 43 */            Iterator it = list.iterator();
/* 51 */            if (it.hasNext()) {
/* 106 */               throw IIlIOloOOO.I000lI(it);
                    }
/* 53 */            return false;
                }

                public final Object clone() {
                    try {
/* 5 */                 return (lloI11II0o0) super.clone();
                    } catch (CloneNotSupportedException e) {
/* 9 */                 I000II.I000O01llI0(e);
/* 12 */                return null;
                    }
                }
            }
