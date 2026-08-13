            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Modifier;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Il11i1 implements OoO00iO0OOl0, Cloneable {
                public static final Il11i1 I00iiO = new Il11i1();
                public final List I00iOIl;
                public final List I00iiI;

                public Il11i1() {
/* 4 */             List list = Collections.EMPTY_LIST;
/* 6 */             this.I00iOIl = list;
/* 8 */             this.I00iiI = list;
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 1 */             Class cls = ooOilO.I00000oIO;
/* 4 */             boolean zI00000oOI = I00000oOI(cls, true);
/* 9 */             boolean zI00000oOI2 = I00000oOI(cls, false);
/* 13 */            if (!zI00000oOI && !zI00000oOI2) {
/* 17 */                return null;
                    }
/* 21 */            Il11i0lOl il11i0lOl = new Il11i0lOl();
/* 24 */            il11i0lOl.I0001Ioi1lo = this;
/* 26 */            il11i0lOl.I00000oOI = zI00000oOI2;
/* 28 */            il11i0lOl.I0000Il00O = zI00000oOI;
/* 30 */            il11i0lOl.I0000O = ooIlIoo1oiOo;
/* 32 */            il11i0lOl.I0000oI00 = ooOilO;
/* 34 */            VarHandle.storeStoreFence();
/* 89 */            return il11i0lOl;
                }

                public final boolean I00000oOI(Class cls, boolean z) {
/* 1 */             if (!z && !Enum.class.isAssignableFrom(cls)) {
/* 11 */                lIo000I lio000i = OOoi0l1.I00000oIO;
/* 21 */                if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
/* 35 */                    return true;
                        }
                    }
/* 44 */            Iterator it = (z ? this.I00iOIl : this.I00iiI).iterator();
/* 52 */            if (it.hasNext()) {
/* 89 */                throw IIlIOloOOO.I000lI(it);
                    }
/* 54 */            return false;
                }

                public final Object clone() {
                    try {
/* 5 */                 return (Il11i1) super.clone();
                    } catch (CloneNotSupportedException e) {
/* 9 */                 I000II.I000O01llI0(e);
/* 12 */                return null;
                    }
                }
            }
