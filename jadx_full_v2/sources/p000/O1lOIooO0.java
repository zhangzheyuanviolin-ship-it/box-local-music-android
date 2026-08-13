            package p000;
            
            public final class O1lOIooO0 implements OiOIlIo {
                public I01Ilo0i I00000oIO;
                public OoiO0oloIiI I00000oOI;
                public Il1o0O I0000Il00O;

                @Override
                public final void I00000oIO(Object obj, Object obj2) {
/* 3 */             OiOO1Ioo.I000iOII(this.I00000oOI, obj, obj2);
                }

                @Override
                public final void I00000oOI(Object obj) {
/* 3 */             this.I00000oOI.getClass();
/* 9 */             OoiO0l ooiO0l = ((Io00l0) obj).unknownFields;
/* 13 */            if (ooiO0l.I0000oI00) {
/* 16 */                ooiO0l.I0000oI00 = false;
                    }
/* 20 */            this.I0000Il00O.getClass();
/* 23 */            IIlIOloOOO.I001i1lo1io(obj);
/* 29 */            throw null;
                }

                @Override
                public final boolean I0000Il00O(Object obj) {
/* 3 */             this.I0000Il00O.getClass();
/* 6 */             IIlIOloOOO.I001i1lo1io(obj);
/* 29 */            throw null;
                }

                @Override
                public final Io00l0 I0000O() {
/* 1 */             I01Ilo0i i01Ilo0i = this.I00000oIO;
                    return i01Ilo0i instanceof Io00l0 ? ((Io00l0) i01Ilo0i).I000OiO() : ((Ilooooo) ((Io00l0) i01Ilo0i).I0000Il00O(5)).I00000oOI();
                }

                @Override
                public final void I0000oI00(Object obj, IOOOi1 iOOOi1, Il1llli0O1 il1llli0O1) {
/* 1 */             OoiO0oloIiI ooiO0oloIiI = this.I00000oOI;
/* 3 */             Il1o0O il1o0O = this.I0000Il00O;
/* 5 */             ooiO0oloIiI.getClass();
/* 8 */             OoiO0oloIiI.I00000oIO(obj);
/* 11 */            il1o0O.getClass();
/* 14 */            obj.getClass();
/* 98 */            throw new ClassCastException();
                }

                @Override
                public final boolean I0001Ioi1lo(Io00l0 io00l0, Io00l0 io00l02) {
/* 3 */             this.I00000oOI.getClass();
                    return io00l0.unknownFields.equals(io00l02.unknownFields);
                }

                @Override
                public final int I000II(Io00l0 io00l0) {
/* 3 */             this.I00000oOI.getClass();
/* 8 */             return io00l0.unknownFields.hashCode();
                }

                @Override
                public final void I000O01llI0(Object obj, IIOOoll iIOOoll) {
/* 3 */             this.I0000Il00O.getClass();
/* 6 */             IIlIOloOOO.I001i1lo1io(obj);
/* 37 */            throw null;
                }

                @Override
                public final int I000OOo1O(Io00l0 io00l0) {
/* 3 */             this.I00000oOI.getClass();
/* 6 */             OoiO0l ooiO0l = io00l0.unknownFields;
/* 8 */             int i = ooiO0l.I0000O;
/* 11 */            if (i != -1) {
/* 13 */                return i;
                    }
/* 15 */            int iI0001Ioi1lo = 0;
/* 18 */            for (int i2 = 0; i2 < ooiO0l.I00000oIO; i2++) {
/* 25 */                int i3 = ooiO0l.I00000oOI[i2] >>> 3;
/* 54 */                iI0001Ioi1lo += IOOOio0o.I0001Ioi1lo(3, (IIO1ooI) ooiO0l.I0000Il00O[i2]) + IOOOio0o.I000OOo1O(i3) + IOOOio0o.I000O01llI0(2) + (IOOOio0o.I000O01llI0(1) * 2);
                    }
/* 58 */            ooiO0l.I0000O = iI0001Ioi1lo;
/* 77 */            return iI0001Ioi1lo;
                }
            }
