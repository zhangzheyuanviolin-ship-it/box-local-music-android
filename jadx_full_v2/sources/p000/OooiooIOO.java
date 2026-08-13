            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OooiooIOO {
                public static final loilIl10Ii I00000oIO = new loilIl10Ii(15);

                public static final IOO11li1OoII I00000oIO(OooioIIoi0O oooioIIoi0O) {
                    IOO11li1OoII iOO11li1OoII;
                    synchronized (I00000oIO) {
/* 10 */                iOO11li1OoII = (IOO11li1OoII) oooioIIoi0O.I0000Il00O("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
/* 12 */                if (iOO11li1OoII == null) {
/* 14 */                    Ii00l101O ii00l101O = Il00o11.I00iOIl;
                            try {
/* 16 */                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 20 */                        ii00l101O = O1OI1l011OO1.I00000oIO.I00ilI0I1;
                            } catch (OIO01O | IllegalStateException unused) {
                            }
/* 28 */                    Ii00l101O ii00l101OI00ioIO = ii00l101O.I00ioIO(lOi1li0o0.I00000oIO());
/* 32 */                    IOO11li1OoII iOO11li1OoII2 = new IOO11li1OoII();
/* 35 */                    iOO11li1OoII2.I00iOIl = ii00l101OI00ioIO;
/* 37 */                    VarHandle.storeStoreFence();
/* 42 */                    oooioIIoi0O.I00000oIO("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", iOO11li1OoII2);
/* 45 */                    iOO11li1OoII = iOO11li1OoII2;
                        }
                    }
/* 50 */            return iOO11li1OoII;
                }
            }
