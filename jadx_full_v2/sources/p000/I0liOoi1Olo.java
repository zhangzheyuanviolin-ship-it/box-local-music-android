            package p000;

            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            
            public final class I0liOoi1Olo extends I01lloolio1l {
                public final I0lio1O01i01 I00iio;
                public final O0iiOioolIi I00ilI0I1;
                public final I0lio1O01i01 I00ilO0;
                public final I10OIIo I00io1l;

                public I0liOoi1Olo(I0lio1O01i01 i0lio1O01i01, O0iiOioolIi o0iiOioolIi, I0lio1O01i01 i0lio1O01i012, I10OIIo i10OIIo) {
/* 1 */             this.I00iio = i0lio1O01i01;
/* 3 */             this.I00ilI0I1 = o0iiOioolIi;
/* 5 */             this.I00ilO0 = i0lio1O01i012;
/* 7 */             this.I00io1l = i10OIIo;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000Il00O(View view, I01oII0IOOO i01oII0IOOO) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = i01oII0IOOO.I00000oIO;
/* 5 */             this.I00iOIl.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 8 */             I0lio1O01i01 i0lio1O01i01 = this.I00iio;
/* 10 */            I0ll1oo i0ll1oo = i0lio1O01i01.I00ol1;
/* 16 */            if (i0ll1oo.I00100o1O0lo()) {
/* 19 */                accessibilityNodeInfo.setVisibleToUser(false);
                    }
/* 22 */            O0iiOioolIi o0iiOioolIi = this.I00ilI0I1;
/* 24 */            O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi.I001IO000();
                    while (true) {
/* 29 */                if (o0iiOioolIiI001IO000 == null) {
/* 47 */                    o0iiOioolIiI001IO000 = null;
                            break;
                        } else if (o0iiOioolIiI001IO000.I010101Oo1lO.I000iOII(8)) {
                            break;
                        } else {
/* 42 */                    o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                        }
                    }
/* 52 */            Integer numValueOf = o0iiOioolIiI001IO000 != null ? Integer.valueOf(o0iiOioolIiI001IO000.I00iiI) : null;
/* 57 */            if (numValueOf != null) {
/* 73 */                if (numValueOf.intValue() == i0lio1O01i01.getSemanticsOwner().I00000oIO().I0001Ioi1lo) {
/* 75 */                    numValueOf = -1;
                        }
                    }
/* 79 */            int iIntValue = numValueOf.intValue();
/* 83 */            i01oII0IOOO.I00000oOI = iIntValue;
/* 85 */            I0lio1O01i01 i0lio1O01i012 = this.I00ilO0;
/* 87 */            accessibilityNodeInfo.setParent(i0lio1O01i012, iIntValue);
/* 90 */            int i = o0iiOioolIi.I00iiI;
/* 94 */            int iI0000O = i0ll1oo.I00ooIo0.I0000O(i);
/* 98 */            I10OIIo i10OIIo = this.I00io1l;
/* 100 */           if (iI0000O != -1) {
/* 102 */               I10I1li0 i10I1li0I0000Il00O = lO1i1O.I0000Il00O(i10OIIo, iI0000O);
/* 106 */               if (i10I1li0I0000Il00O != null) {
/* 108 */                   accessibilityNodeInfo.setTraversalBefore(i10I1li0I0000Il00O);
                        } else {
/* 112 */                   accessibilityNodeInfo.setTraversalBefore(i0lio1O01i012, iI0000O);
                        }
/* 117 */               i0lio1O01i01.I00000oOI(i, accessibilityNodeInfo, i0ll1oo.I00oooO);
                    }
/* 122 */           int iI0000O2 = i0ll1oo.I00ooiO1I.I0000O(i);
/* 126 */           if (iI0000O2 != -1) {
/* 128 */               I10I1li0 i10I1li0I0000Il00O2 = lO1i1O.I0000Il00O(i10OIIo, iI0000O2);
/* 132 */               if (i10I1li0I0000Il00O2 != null) {
/* 134 */                   accessibilityNodeInfo.setTraversalAfter(i10I1li0I0000Il00O2);
                        } else {
/* 138 */                   accessibilityNodeInfo.setTraversalAfter(i0lio1O01i012, iI0000O2);
                        }
/* 143 */               i0lio1O01i01.I00000oOI(i, accessibilityNodeInfo, i0ll1oo.I0100i);
                    }
                }
            }
