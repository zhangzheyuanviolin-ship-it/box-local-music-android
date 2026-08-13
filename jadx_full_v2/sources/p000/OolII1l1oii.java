            package p000;
            
            public final class OolII1l1oii implements Oi01Ooii1Ol {
                public OolIOoI1IiO I00iOIl;

                @Override
                public final void I00IOO(Oi0Iil oi0Iil, long j, I0oIili1iI i0oIili1iI) {
                    Integer num;
/* 7 */             if (this.I00iOIl.I00100o1O0lo.I00000oIO == 0 || (num = (Integer) oi0Iil.I00000oOI(Olo10o10.I00000oOI)) == null) {
/* 98 */                return;
                    }
/* 20 */            OolIOoI1IiO oolIOoI1IiO = this.I00iOIl;
/* 22 */            int iIntValue = num.intValue();
                    synchronized (oolIOoI1IiO.I0000Il00O) {
/* 29 */                I1Il0loi i1Il0loi = oolIOoI1IiO.I0001Ioi1lo;
/* 35 */                while (!i1Il0loi.isEmpty() && ((OolIIIlOOo) i1Il0loi.first()).I00000oIO <= iIntValue) {
/* 57 */                    ((OolIIIlOOo) i1Il0loi.first()).I00000oOI.I00O10llo(OoiIlOl1iI.I00000oIO);
/* 60 */                    IOOii0O10Io0.I0010o(i1Il0loi);
/* 67 */                    this.I00iOIl.I00100o1O0lo.I00000oIO();
                        }
                    }
                }

                @Override
                public final void I00IoiI(Oi0Iil oi0Iil, long j, Oi0I000 oi0I000) {
                    Integer num;
/* 9 */             if (this.I00iOIl.I00100o1O0lo.I00000oIO == 0 || (num = (Integer) oi0Iil.I00000oOI(Olo10o10.I00000oOI)) == null) {
/* 408 */               return;
                    }
/* 24 */            OolIOoI1IiO oolIOoI1IiO = this.I00iOIl;
/* 26 */            int iIntValue = num.intValue();
                    synchronized (oolIOoI1IiO.I0000Il00O) {
/* 33 */                I1Il0loi i1Il0loi = oolIOoI1IiO.I0001Ioi1lo;
/* 57 */                Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + oi0I000.I00Io1lO()));
/* 64 */                while (!i1Il0loi.isEmpty() && ((OolIIIlOOo) i1Il0loi.first()).I00000oIO <= iIntValue) {
/* 84 */                    ((OolIIIlOOo) i1Il0loi.first()).I00000oOI.I00iIO(th);
/* 87 */                    IOOii0O10Io0.I0010o(i1Il0loi);
/* 94 */                    this.I00iOIl.I00100o1O0lo.I00000oIO();
                        }
                    }
                }
            }
