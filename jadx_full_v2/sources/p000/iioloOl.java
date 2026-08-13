            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iioloOl {
                public static final Ii00l101O I00000oIO(Ii00l101O ii00l101O, Ii00l101O ii00l101O2, boolean z) {
/* 1 */             Object obj = Boolean.FALSE;
/* 5 */             int i = 27;
/* 16 */            boolean zBooleanValue = ((Boolean) ii00l101O.I00IoiI(new IOioOOi0I(i), obj)).booleanValue();
/* 31 */            boolean zBooleanValue2 = ((Boolean) ii00l101O2.I00IoiI(new IOioOOi0I(i), obj)).booleanValue();
/* 35 */            if (!zBooleanValue && !zBooleanValue2) {
/* 39 */                return ii00l101O.I00ioIO(ii00l101O2);
                    }
/* 46 */            OOo0ooi oOo0ooi = new OOo0ooi();
/* 49 */            oOo0ooi.I00iOIl = ii00l101O2;
/* 54 */            I1IIol00oIo0 i1IIol00oIo0 = new I1IIol00oIo0(4);
/* 57 */            i1IIol00oIo0.I00iiO = oOo0ooi;
/* 59 */            i1IIol00oIo0.I00iiI = z;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            Object obj2 = Il00o11.I00iOIl;
/* 70 */            Ii00l101O ii00l101O3 = (Ii00l101O) ii00l101O.I00IoiI(i1IIol00oIo0, obj2);
/* 72 */            if (zBooleanValue2) {
/* 89 */                oOo0ooi.I00iOIl = ((Ii00l101O) oOo0ooi.I00iOIl).I00IoiI(new IOioOOi0I(28), obj2);
                    }
/* 95 */            return ii00l101O3.I00ioIO((Ii00l101O) oOo0ooi.I00iOIl);
                }

                public static final Ii00l101O I00000oOI(Ii0110 ii0110, Ii00l101O ii00l101O) {
/* 6 */             Ii00l101O ii00l101OI00000oIO = I00000oIO(ii0110.I00000oIO(), ii00l101O, true);
/* 10 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
                    return (ii00l101OI00000oIO == iiI0oillOO10 || ii00l101OI00000oIO.I00lli11(o0iOli.I00iiO) != null) ? ii00l101OI00000oIO : ii00l101OI00000oIO.I00ioIO(iiI0oillOO10);
                }

                public static final OoiI00olo I0000Il00O(IOoil1iiIilo iOoil1iiIilo, Ii00l101O ii00l101O, Object obj) {
/* 3 */             OoiI00olo ooiI00olo = null;
/* 4 */             if ((iOoil1iiIilo instanceof Ii011lOOlI1) && ii00l101O.I00lli11(IIoiil1l0I.I00iio) != null) {
/* 15 */                Ii011lOOlI1 callerFrame = (Ii011lOOlI1) iOoil1iiIilo;
                        while (true) {
/* 19 */                    if ((callerFrame instanceof IiiIIO0O0o) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                                break;
                            }
/* 31 */                    if (callerFrame instanceof OoiI00olo) {
/* 34 */                        ooiI00olo = (OoiI00olo) callerFrame;
                                break;
                            }
                        }
/* 36 */                if (ooiI00olo != null) {
/* 38 */                    ooiI00olo.I00io1l(ii00l101O, obj);
                        }
                    }
/* 215 */           return ooiI00olo;
                }
            }
