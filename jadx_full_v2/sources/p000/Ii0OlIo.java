            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii0OlIo implements OoI1IIOl {
                public int I00000oOI;

                @Override
                public final OoI1O1iOio00 I00000oIO(I1OoI00 i1OoI00, IoiOl01IilO ioiOl01IilO) {
/* 3 */             if (!(ioiOl01IilO instanceof OliOlO1o1)) {
/* 7 */                 OIIoiI oIIoiI = new OIIoiI();
/* 10 */                VarHandle.storeStoreFence();
/* 13 */                return oIIoiI;
                    }
/* 21 */            if (((OliOlO1o1) ioiOl01IilO).I0000Il00O == Ii1I1OOilolI.I00iOIl) {
/* 25 */                OIIoiI oIIoiI2 = new OIIoiI();
/* 28 */                VarHandle.storeStoreFence();
/* 31 */                return oIIoiI2;
                    }
/* 34 */            int i = this.I00000oOI;
/* 36 */            Ii0OoO01Oo0 ii0OoO01Oo0 = new Ii0OoO01Oo0();
/* 39 */            ii0OoO01Oo0.I00000oIO = ioiOl01IilO;
/* 41 */            ii0OoO01Oo0.I00000oOI = i;
/* 43 */            if (i > 0) {
/* 45 */                VarHandle.storeStoreFence();
/* 48 */                return ii0OoO01Oo0;
                    }
/* 51 */            I000II.I000iOII("durationMillis must be > 0.");
/* 54 */            return null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ii0OlIo) && this.I00000oOI == ((Ii0OlIo) obj).I00000oOI;
                }

                public final int hashCode() {
/* 10 */            return Boolean.hashCode(false) + (this.I00000oOI * 31);
                }
            }
