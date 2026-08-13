            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.concurrent.Executor;
            
            public final class IIo01011I implements OIOilII0IlO {
                public IIo0IOlilI I00iOIl;
                public String I00iiI;

                @Override
                public final void I00000oOI(Object obj) {
/* 1 */             IIo0IOlilI iIo0IOlilI = this.I00iOIl;
/* 3 */             String str = this.I00iiI;
/* 5 */             I1illlI1 i1illlI1 = (I1illlI1) obj;
/* 15 */            if (!iIo0IOlilI.I000l1.get()) {
/* 18 */                l11I11lO.I0000O(3, "CameraPresencePrvdr");
/* 21 */                return;
                    }
/* 24 */            if (i1illlI1.I00000oOI != null) {
/* 30 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Camera ", str, " state changed to ");
/* 40 */                sbI001IIilI0O.append(IIl001iO0Io.I001lllioOl(i1illlI1.I00000oIO));
/* 45 */                sbI001IIilI0O.append(" with error: ");
/* 48 */                I1io1I i1io1I = i1illlI1.I00000oOI;
/* 60 */                sbI001IIilI0O.append(i1io1I != null ? Integer.valueOf(i1io1I.I00000oIO) : null);
/* 65 */                sbI001IIilI0O.append(". Triggering refresh.");
/* 72 */                l11I11lO.I0000oI00("CameraPresencePrvdr", sbI001IIilI0O.toString());
/* 75 */                Executor executor = iIo0IOlilI.I00000oIO;
/* 80 */                IIo00ilO iIo00ilO = new IIo00ilO(1);
/* 83 */                iIo00ilO.I00iiI = iIo0IOlilI;
/* 85 */                VarHandle.storeStoreFence();
/* 88 */                executor.execute(iIo00ilO);
                    }
                }
            }
