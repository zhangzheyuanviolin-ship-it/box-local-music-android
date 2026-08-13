            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class OoI1I1i1 {
                public OoIoOiiO1 I00000oIO;
                public OIooliIO0 I00000oOI;
                public OoI1Oi0l1I0o I0000Il00O;

                public final OoI11o1OI I00000oIO(Function1 function1, Object obj, I110ooool i110ooool, Function1 function12) {
/* 1 */             OoIoOiiO1 ooIoOiiO1 = this.I00000oIO;
/* 3 */             OoI1Oi0l1I0o ooI1Oi0l1I0o = this.I0000Il00O;
/* 5 */             OIooliIO0 oIooliIO0 = this.I00000oOI;
/* 11 */            OoI11o1OI ooI11o1OI = (OoI11o1OI) oIooliIO0.getValue();
/* 13 */            if (ooI11o1OI == null) {
/* 25 */                Object objInvoke = function12.invoke(ooI1Oi0l1I0o.I00000oIO.I00olI());
/* 45 */                I110ooool i110ooool2 = (I110ooool) ooIoOiiO1.I00000oIO.invoke(function12.invoke(ooI1Oi0l1I0o.I00000oIO.I00olI()));
/* 47 */                i110ooool2.I0000O();
/* 50 */                OoI1O1OIoI ooI1O1OIoI = new OoI1O1OIoI(ooI1Oi0l1I0o, objInvoke, i110ooool2, ooIoOiiO1);
/* 53 */                ooI11o1OI = new OoI11o1OI();
/* 56 */                ooI11o1OI.I00iio = this;
/* 58 */                ooI11o1OI.I00iOIl = ooI1O1OIoI;
/* 60 */                ooI11o1OI.I00iiI = function1;
/* 62 */                ooI11o1OI.I00iiO = function12;
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                oIooliIO0.setValue(ooI11o1OI);
/* 72 */                ooI1Oi0l1I0o.I000OiO.add(ooI1O1OIoI);
                    }
/* 75 */            ooI11o1OI.I00iiO = function12;
/* 77 */            ooI11o1OI.I00iiI = function1;
/* 83 */            ooI11o1OI.I00000oIO(ooI1Oi0l1I0o.I0001Ioi1lo(), obj, i110ooool);
/* 204 */           return ooI11o1OI;
                }
            }
