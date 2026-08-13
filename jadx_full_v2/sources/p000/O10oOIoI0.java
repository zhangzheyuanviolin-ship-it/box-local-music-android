            package p000;

            import android.content.Context;
            import androidx.work.WorkerParameters;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.UUID;
            
            public final class O10oOIoI0 extends IoOl011l0ol {
                public static final byte[] I000oI1ioi;
                public static final Object I00100l0;
                public Context I000O01llI0;
                public IOllii I000OOo1O;
                public OloIli I000OiO;
                public looil0O1Io1 I000iOII;
                public lolOiIoiillI I000l1;
                public HashMap I000lI;
                public HashMap I000o00OoI0I;

                static {
/* 3 */             IIi0oIl.I000OiO("ListenableWorkerImpl");
/* 9 */             I000oI1ioi = new byte[0];
/* 16 */            I00100l0 = new Object();
                }

                public final void I00000oOI(String str, String str2, WorkerParameters workerParameters) {
/* 7 */             O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I000lI.get(str);
/* 15 */            Throwable th = (Throwable) this.I000o00OoI0I.get(str);
/* 17 */            if (o10oIiIi0OI0 == null && th == null) {
                        synchronized (I00100l0) {
                            try {
/* 30 */                        O10oIiIi0OI0 o10oIiIi0OI02 = (O10oIiIi0OI0) this.I000lI.get(str);
/* 38 */                        Throwable th2 = (Throwable) this.I000o00OoI0I.get(str);
/* 40 */                        if (o10oIiIi0OI02 == null && th2 == null) {
/* 56 */                            this.I000lI.put(str, this.I000OOo1O.I0000oI00.I00000oIO(this.I000O01llI0, str2, workerParameters));
                                }
                            } catch (Throwable th3) {
/* 63 */                        this.I000o00OoI0I.put(str, th3);
                            } finally {
                            }
                        }
                    }
                }

                public final Oll0oO I0000O(String str, WorkerParameters workerParameters) {
/* 3 */             String string = workerParameters.I00000oIO.toString();
/* 7 */             I00000oOI(string, str, workerParameters);
/* 17 */            O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I000lI.get(string);
/* 26 */            Throwable th = (Throwable) this.I000o00OoI0I.get(string);
/* 28 */            IOllii iOllii = this.I000OOo1O;
/* 30 */            OloIli oloIli = this.I000OiO;
/* 39 */            Ii00lIOoi ii00lIOoiI00000oIO = ilIl1O1ii0Oo.I00000oIO((Io1iO1Ooo0l) ((OillOo0) oloIli).I00ilI0I1);
/* 43 */            IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 55 */            return Oll101.I00000oIO(ii00lIOoiI00000oIO, false, new I10i01i0Iilo(o10oIiIi0OI0, th, iOllii, oloIli, str, workerParameters, null, 4));
                }

                @Override
                public final void I001IIilI0O(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             OloIli oloIli = this.I000OiO;
                    try {
/* 9 */                 OIoo0oi0lIO0 oIoo0oi0lIO0 = (OIoo0oi0lIO0) l1oOOloO0.I00000oOI(bArr, OIoo0oi0lIO0.CREATOR);
/* 11 */                OO00o1o oO00o1o = oIoo0oi0lIO0.I00iiI;
/* 13 */                IOllii iOllii = this.I000OOo1O;
/* 15 */                looil0O1Io1 looil0o1io1 = this.I000iOII;
/* 17 */                lolOiIoiillI loloiioiilli = this.I000l1;
/* 23 */                UUID uuid = oO00o1o.I00iOIl;
/* 47 */                WorkerParameters workerParameters = new WorkerParameters(uuid, oO00o1o.I00iiI, oO00o1o.I00iiO, oO00o1o.I00iio, oO00o1o.I00ilI0I1, oO00o1o.I00ilO0, iOllii.I00000oIO, iOllii.I00000oOI, oloIli, iOllii.I0000oI00, looil0o1io1, loloiioiilli);
/* 50 */                String string = uuid.toString();
/* 54 */                String str = oIoo0oi0lIO0.I00iOIl;
/* 60 */                IIi0oIl.I000II().getClass();
/* 63 */                Oll0oO oll0oOI0000O = I0000O(str, workerParameters);
/* 70 */                IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(1);
/* 73 */                iO0iIlI1li.I00ilI0I1 = this;
/* 75 */                iO0iIlI1li.I00iiI = oll0oOI0000O;
/* 77 */                iO0iIlI1li.I00iiO = ioOlo1llOO;
/* 79 */                iO0iIlI1li.I00iio = string;
/* 81 */                VarHandle.storeStoreFence();
/* 92 */                oll0oOI0000O.I00iiI.addListener(iO0iIlI1li, (OilOol) ((OillOo0) oloIli).I00iiI);
                    } catch (Throwable th) {
/* 98 */                O10lo0O.I00000oIO(ioOlo1llOO, th);
                    }
                }

                @Override
                public final void I001l0I00(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
/* 1 */             OloIli oloIli = this.I000OiO;
                    try {
/* 9 */                 OIoo0oi0lIO0 oIoo0oi0lIO0 = (OIoo0oi0lIO0) l1oOOloO0.I00000oOI(bArr, OIoo0oi0lIO0.CREATOR);
/* 11 */                OO00o1o oO00o1o = oIoo0oi0lIO0.I00iiI;
/* 13 */                IOllii iOllii = this.I000OOo1O;
/* 15 */                looil0O1Io1 looil0o1io1 = this.I000iOII;
/* 17 */                lolOiIoiillI loloiioiilli = this.I000l1;
/* 23 */                UUID uuid = oO00o1o.I00iOIl;
/* 47 */                WorkerParameters workerParameters = new WorkerParameters(uuid, oO00o1o.I00iiI, oO00o1o.I00iiO, oO00o1o.I00iio, oO00o1o.I00ilI0I1, oO00o1o.I00ilO0, iOllii.I00000oIO, iOllii.I00000oOI, oloIli, iOllii.I0000oI00, looil0o1io1, loloiioiilli);
/* 50 */                String string = uuid.toString();
/* 56 */                I00000oOI(string, oIoo0oi0lIO0.I00iOIl, workerParameters);
/* 65 */                O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I000lI.get(string);
/* 73 */                Throwable th = (Throwable) this.I000o00OoI0I.get(string);
/* 75 */                if (th != null) {
/* 77 */                    O10lo0O.I00000oIO(ioOlo1llOO, th);
/* 80 */                    return;
                        }
/* 84 */                if (o10oIiIi0OI0 == null) {
/* 118 */                   O10lo0O.I00000oIO(ioOlo1llOO, new IllegalStateException("Should never happen."));
/* 121 */                   return;
                        }
/* 90 */                OilOol oilOol = (OilOol) ((OillOo0) oloIli).I00iiI;
/* 95 */                O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(0);
/* 98 */                o10oO1IiI1.I00iio = this;
/* 100 */               o10oO1IiI1.I00iiI = o10oIiIi0OI0;
/* 102 */               o10oO1IiI1.I00iiO = ioOlo1llOO;
/* 104 */               VarHandle.storeStoreFence();
/* 107 */               oilOol.execute(o10oO1IiI1);
                    } catch (Throwable th2) {
/* 122 */               O10lo0O.I00000oIO(ioOlo1llOO, th2);
                    }
                }

                @Override
                public final void I00II0oii1o(IoOlo1llOO ioOlo1llOO, byte[] bArr) {
                    try {
/* 7 */                 OIoo00 oIoo00 = (OIoo00) l1oOOloO0.I00000oOI(bArr, OIoo00.CREATOR);
/* 9 */                 String str = oIoo00.I00iOIl;
/* 11 */                int i = oIoo00.I00iiI;
/* 17 */                IIi0oIl.I000II().getClass();
/* 26 */                O10oIiIi0OI0 o10oIiIi0OI0 = (O10oIiIi0OI0) this.I000lI.get(str);
/* 28 */                if (o10oIiIi0OI0 == null) {
/* 61 */                    O10lo0O.I00000oOI(ioOlo1llOO, I000oI1ioi);
/* 64 */                    return;
                        }
/* 36 */                OilOol oilOol = (OilOol) ((OillOo0) this.I000OiO).I00iiI;
/* 41 */                II0OlOll iI0OlOll = new II0OlOll(5);
/* 44 */                iI0OlOll.I00iiO = o10oIiIi0OI0;
/* 46 */                iI0OlOll.I00iiI = i;
/* 48 */                iI0OlOll.I00iio = ioOlo1llOO;
/* 50 */                VarHandle.storeStoreFence();
/* 53 */                oilOol.execute(iI0OlOll);
                    } catch (Throwable th) {
/* 65 */                O10lo0O.I00000oIO(ioOlo1llOO, th);
                    }
                }
            }
