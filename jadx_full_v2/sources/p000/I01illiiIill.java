            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            
/* 47 */    public abstract class I01illiiIill implements OoOIOoO1I {
                public int I00iOIl;
                public final O1I00Oo0oo0o I00iiI;

                public I01illiiIill(O1I0OloI o1I0OloI) {
/* 7 */             I01iiIii10O i01iiIii10O = new I01iiIii10O(1);
/* 10 */            i01iiIii10O.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 18 */            I00iiI i00iiI = new I00iiI(5);
/* 21 */            i00iiI.I00iiI = this;
/* 23 */            VarHandle.storeStoreFence();
/* 31 */            this.I00iiI = new O1I00Oo0oo0o(o1I0OloI, i01iiIii10O, i00iiI);
                }

                public abstract Collection I00000oIO();

                public abstract O0iIl1 I00000oOI();

                public abstract O1oO0lOoI1 I0000Il00O();

                @Override
                public final List I0000oI00() {
/* 9 */             return ((I01ilI00oIi) this.I00iiI.invoke()).I00000oOI;
                }

                public abstract boolean I000O01llI0(IOIiO1lIl0l iOIiO1lIl0l);

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if ((obj instanceof OoOIOoO1I) && obj.hashCode() == hashCode()) {
/* 22 */                OoOIOoO1I ooOIOoO1I = (OoOIOoO1I) obj;
/* 40 */                if (ooOIOoO1I.I000II().size() == I000II().size()) {
/* 43 */                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = I00100o1O0lo();
/* 47 */                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ooOIOoO1I.I00100o1O0lo();
/* 51 */                    if (iOIiO1lIl0lI00100o1O0lo2 == null || Il0ooiloI.I0000oI00(iOIiO1lIl0lI00100o1O0lo) || IiOiIO0i1Oil.I000lI(iOIiO1lIl0lI00100o1O0lo) || Il0ooiloI.I0000oI00(iOIiO1lIl0lI00100o1O0lo2) || IiOiIO0i1Oil.I000lI(iOIiO1lIl0lI00100o1O0lo2)) {
/* 7 */                         return false;
                            }
/* 78 */                    return I000O01llI0(iOIiO1lIl0lI00100o1O0lo2);
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 6 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = I00100o1O0lo();
/* 33 */            int iIdentityHashCode = (Il0ooiloI.I0000oI00(iOIiO1lIl0lI00100o1O0lo) || IiOiIO0i1Oil.I000lI(iOIiO1lIl0lI00100o1O0lo)) ? System.identityHashCode(this) : IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo).I00000oIO.hashCode();
/* 37 */            this.I00iOIl = iIdentityHashCode;
/* 113 */           return iIdentityHashCode;
                }

/* 48 */        public List I000OOo1O(List list) {
/* 49 */            return list;
                }
            }
