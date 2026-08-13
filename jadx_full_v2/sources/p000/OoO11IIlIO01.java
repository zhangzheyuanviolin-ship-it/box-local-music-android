            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoO11IIlIO01 implements OoO00iO0OOl0 {
                public final int I00iOIl;
                public Class I00iiI;
                public OoO00O1IiOl I00iiO;

                public OoO11IIlIO01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
                    switch (this.I00iOIl) {
                        case 0:
/* 36 */                    if (ooOilO.I00000oIO == this.I00iiI) {
/* 38 */                        return this.I00iiO;
                            }
/* 3 */                     return null;
                        default:
/* 7 */                     Class<?> cls = ooOilO.I00000oIO;
/* 15 */                    if (!this.I00iiI.isAssignableFrom(cls)) {
/* 3 */                         return null;
                            }
/* 21 */                    O00oI0iiI1 o00oI0iiI1 = new O00oI0iiI1(2);
/* 24 */                    o00oI0iiI1.I0000Il00O = this;
/* 26 */                    o00oI0iiI1.I00000oOI = cls;
/* 28 */                    VarHandle.storeStoreFence();
/* 31 */                    return o00oI0iiI1;
                    }
                }

                public final String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 69 */                    return "Factory[type=" + this.I00iiI.getName() + ",adapter=" + this.I00iiO + "]";
                        default:
/* 37 */                    return "Factory[typeHierarchy=" + this.I00iiI.getName() + ",adapter=" + this.I00iiO + "]";
                    }
                }
            }
