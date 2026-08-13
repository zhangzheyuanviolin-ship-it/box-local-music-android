            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O0i0iioIlO {
                public int I00000oIO;
                public l0lOoI I00000oOI;
                public final ArrayList I0000Il00O = new ArrayList(0);
                public O0i0iioIlO I0000O;
                public O0i0iioIlO I0000oI00;
                public O0i01II I0001Ioi1lo;
                public final ArrayList I000II;

                public O0i0iioIlO(int i) {
/* 4 */             this.I00000oIO = i;
/* 16 */            O1li00Io.I00000oIO.getClass();
/* 19 */            List listI00000oIO = O1lOolo.I00000oIO();
/* 33 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 36 */            Iterator it = listI00000oIO.iterator();
/* 44 */            while (it.hasNext()) {
/* 54 */                ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 59 */                O0IOi1 o0IOi1 = new O0IOi1();
/* 67 */                o0IOi1.I00000oOI = new ArrayList();
/* 69 */                VarHandle.storeStoreFence();
/* 72 */                arrayList.add(o0IOi1);
                    }
/* 76 */            this.I000II = arrayList;
                }

                public final l0lOoI I00000oIO() {
/* 1 */             l0lOoI l0looi = this.I00000oOI;
/* 3 */             if (l0looi != null) {
/* 5 */                 return l0looi;
                    }
/* 8 */             O0000Ioio00.I000OOo1O("classifier");
/* 29 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 101 */               return true;
                    }
/* 18 */            if (!O0i0iioIlO.class.equals(obj != null ? obj.getClass() : null)) {
/* 99 */                return false;
                    }
/* 21 */            O0i0iioIlO o0i0iioIlO = (O0i0iioIlO) obj;
                    return this.I00000oIO == o0i0iioIlO.I00000oIO && I00000oIO().equals(o0i0iioIlO.I00000oIO()) && O0000Ioio00.I0000O(this.I0000Il00O, o0i0iioIlO.I0000Il00O) && O0000Ioio00.I0000O(this.I0000oI00, o0i0iioIlO.I0000oI00) && O0000Ioio00.I0000O(this.I0000O, o0i0iioIlO.I0000O) && O0000Ioio00.I0000O(this.I0001Ioi1lo, o0i0iioIlO.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, o0i0iioIlO.I000II);
                }

                public final int hashCode() {
/* 22 */            return this.I0000Il00O.hashCode() + ((I00000oIO().hashCode() + (this.I00000oIO * 31)) * 31);
                }
            }
