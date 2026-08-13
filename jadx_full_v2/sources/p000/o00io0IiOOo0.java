            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.concurrent.Executors;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
/* 153 */   public final class o00io0IiOOo0 implements IIiOOIoi0, OOIOIIOIii1, I1OlOl11O0 {
                public static o00io0IiOOo0 I00ilO0;
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public o00io0IiOOo0(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
/* 1 */             char c = 4;
/* 2 */             this.I00iOIl = 4;
/* 9 */             OOIOIl1lOOl oOIOIl1lOOl = new OOIOIl1lOOl(this);
/* 12 */            this.I00iiO = oOIOIl1lOOl;
/* 19 */            if (!Oi010OO0.I0001Ioi1lo(2)) {
/* 149 */               IioIoO10iOiI.I000oI1ioi("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
/* 153 */               throw null;
                    }
/* 21 */            this.I00iio = str;
/* 23 */            this.I00ilI0I1 = secretKeySpec;
/* 32 */            if (secretKeySpec.getEncoded().length < 16) {
/* 146 */               throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
                    }
                    switch (str.hashCode()) {
                        case -1823053428:
/* 92 */                    if (!str.equals("HMACSHA1")) {
/* 42 */                        c = 65535;
                                break;
                            } else {
/* 95 */                        c = 0;
                                break;
                            }
                        case 392315023:
/* 81 */                    if (str.equals("HMACSHA224")) {
/* 84 */                        c = 1;
                                break;
                            }
                            break;
                        case 392315118:
/* 70 */                    if (str.equals("HMACSHA256")) {
/* 73 */                        c = 2;
                                break;
                            }
                            break;
                        case 392316170:
/* 59 */                    if (str.equals("HMACSHA384")) {
/* 62 */                        c = 3;
                                break;
                            }
                            break;
                        case 392317873:
/* 50 */                    if (!str.equals("HMACSHA512")) {
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
/* 133 */                   this.I00iiI = 20;
                            break;
                        case 1:
/* 128 */                   this.I00iiI = 28;
                            break;
                        case 2:
/* 123 */                   this.I00iiI = 32;
                            break;
                        case 3:
/* 118 */                   this.I00iiI = 48;
                            break;
                        case 4:
/* 113 */                   this.I00iiI = 64;
                            break;
                        default:
/* 110 */                   throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    }
/* 135 */           oOIOIl1lOOl.get();
                }

                public static synchronized o00io0IiOOo0 I000II(Context context) {
                    o00io0IiOOo0 o00io0iiooo0;
/* 4 */             o00io0iiooo0 = I00ilO0;
/* 6 */             if (o00io0iiooo0 == null) {
/* 23 */                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new iO10oo0i1o("MessengerIpcClient", 5)));
/* 28 */                o00io0iiooo0 = new o00io0IiOOo0(0);
/* 36 */                o00io0iiooo0.I00ilI0I1 = new liiilOIIl(o00io0iiooo0);
/* 38 */                o00io0iiooo0.I00iiI = 1;
/* 40 */                o00io0iiooo0.I00iio = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
/* 46 */                o00io0iiooo0.I00iiO = context.getApplicationContext();
/* 48 */                VarHandle.storeStoreFence();
/* 51 */                I00ilO0 = o00io0iiooo0;
                    }
/* 57 */            return o00io0iiooo0;
                }

                public Object I00000oIO() {
                    Object objRemoveLast;
                    synchronized (this.I00iio) {
/* 8 */                 objRemoveLast = ((ArrayDeque) this.I00iiO).removeLast();
                    }
/* 13 */            return objRemoveLast;
                }

                public void I00000oOI(IoiO1IO1I1i ioiO1IO1I1i) throws Exception {
                    Object objI00000oIO;
/* 1 */             IoiIIlOol1 ioiIIlOol1I00i0oil = ioiO1IO1I1i.I00i0oil();
/* 15 */            IIlI0I1li iIlI0I1li = ioiIIlOol1I00i0oil instanceof IIlI0lO ? ((IIlI0lO) ioiIIlOol1I00i0oil).I00000oIO : null;
/* 16 */            if (iIlI0I1li == null || ((iIlI0I1li.I000OiO() != IIl1lO0oO.I00ilO0 && iIlI0I1li.I000OiO() != IIl1lO0oO.I00iio) || iIlI0I1li.I000OOo1O() != IIl1lO0O.I00ilI0I1 || iIlI0I1li.I0001Ioi1lo() != IIl1oi.I00iio)) {
/* 57 */                ((OoOil11Ol1o) this.I00ilI0I1).getClass();
/* 60 */                ioiO1IO1I1i.close();
/* 63 */                return;
                    }
                    synchronized (this.I00iio) {
                        try {
/* 79 */                    objI00000oIO = ((ArrayDeque) this.I00iiO).size() >= this.I00iiI ? I00000oIO() : null;
/* 90 */                    ((ArrayDeque) this.I00iiO).addFirst(ioiO1IO1I1i);
                        } catch (Throwable th) {
/* 168 */                   throw th;
                        }
                    }
/* 98 */            if (((OoOil11Ol1o) this.I00ilI0I1) == null || objI00000oIO == null) {
/* 107 */               return;
                    }
/* 104 */           ((IoiO1IO1I1i) objI00000oIO).close();
                }

                public String I0000Il00O() {
/* 5 */             StringBuilder sb = new StringBuilder("$");
/* 10 */            int i = this.I00iiI + 1;
/* 13 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                Object obj = ((Object[]) this.I00iio)[i2];
/* 23 */                if (obj instanceof OilOloI) {
/* 25 */                    OilOloI oilOloI = (OilOloI) obj;
/* 33 */                    boolean zI0000O = O0000Ioio00.I0000O(oilOloI.I000oI1ioi(), Oli00oo0l.I0000Il00O);
/* 39 */                    int[] iArr = (int[]) this.I00ilI0I1;
/* 41 */                    if (!zI0000O) {
/* 68 */                        int i3 = iArr[i2];
/* 70 */                        if (i3 >= 0) {
/* 74 */                            sb.append(".");
/* 81 */                            sb.append(oilOloI.I0001Ioi1lo(i3));
                                }
                            } else if (iArr[i2] != -1) {
/* 50 */                        sb.append("[");
/* 59 */                        sb.append(((int[]) this.I00ilI0I1)[i2]);
/* 64 */                        sb.append("]");
                            }
                        } else if (obj == Io1Oioii1111.I00iio) {
/* 91 */                    sb.append("[<debug info disabled>]");
                        } else if (obj != O1oO0lOoI1.I00iio) {
/* 101 */                   sb.append("['");
/* 104 */                   sb.append(obj);
/* 109 */                   sb.append("']");
                        }
                    }
/* 115 */           return sb.toString();
                }

                public void I0000O() {
/* 3 */             OioOlIlii1il oioOlIlii1il = new OioOlIlii1il();
/* 11 */            oioOlIlii1il.I00000oIO = new OiI11loO0();
/* 18 */            oioOlIlii1il.I00000oOI = new OiI11loO0();
/* 25 */            oioOlIlii1il.I0000Il00O = new OiI11loO0();
/* 32 */            oioOlIlii1il.I0000O = new OiI11loO0();
/* 40 */            oioOlIlii1il.I0000oI00 = new I00iOIl(0.0f);
/* 47 */            oioOlIlii1il.I0001Ioi1lo = new I00iOIl(0.0f);
/* 54 */            oioOlIlii1il.I000II = new I00iOIl(0.0f);
/* 61 */            oioOlIlii1il.I000O01llI0 = new I00iOIl(0.0f);
/* 65 */            int i = 0;
/* 69 */            oioOlIlii1il.I000OOo1O = new Iioi0lilII(i);
/* 76 */            oioOlIlii1il.I000OiO = new Iioi0lilII(i);
/* 83 */            oioOlIlii1il.I000iOII = new Iioi0lilII(i);
/* 90 */            oioOlIlii1il.I000l1 = new Iioi0lilII(i);
/* 92 */            this.I00iiO = oioOlIlii1il;
/* 98 */            this.I00iio = new int[10][];
/* 102 */           this.I00ilI0I1 = new OioOlIlii1il[10];
                }

                @Override
                public byte[] I0000oI00(int i, byte[] bArr) throws IllegalStateException, InvalidAlgorithmParameterException {
/* 3 */             OOIOIl1lOOl oOIOIl1lOOl = (OOIOIl1lOOl) this.I00iiO;
/* 7 */             if (i > this.I00iiI) {
/* 106 */               throw new InvalidAlgorithmParameterException("tag size too big");
                    }
/* 15 */            ((Mac) oOIOIl1lOOl.get()).update(bArr);
/* 28 */            return Arrays.copyOf(((Mac) oOIOIl1lOOl.get()).doFinal(), i);
                }

                public void I0001Ioi1lo() {
/* 3 */             int i = this.I00iiI * 2;
/* 13 */            this.I00iio = Arrays.copyOf((Object[]) this.I00iio, i);
/* 15 */            int[] iArr = new int[i];
/* 19 */            for (int i2 = 0; i2 < i; i2++) {
/* 22 */                iArr[i2] = -1;
                    }
/* 33 */            I1IoiO1l.I000l1(0, 0, 14, (int[]) this.I00ilI0I1, iArr);
/* 36 */            this.I00ilI0I1 = iArr;
                }

                public synchronized o0IiOl I000O01llI0(lli1OiO lli1oio) {
                    try {
/* 9 */                 if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 17 */                    "Queueing ".concat(lli1oio.toString());
                        }
/* 31 */                if (!((liiilOIIl) this.I00ilI0I1).I00000oIO(lli1oio)) {
/* 35 */                    liiilOIIl liiiloiil = new liiilOIIl(this);
/* 38 */                    this.I00ilI0I1 = liiiloiil;
/* 40 */                    liiiloiil.I00000oIO(lli1oio);
                        }
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
/* 45 */            return lli1oio.I00000oOI.I00000oIO;
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 26 */            return iOi1II01i0.I0000O((IIOlO1ii) this.I00iiO, null, null, new IIlO0II00o(iIiOOI, null, (Ool1i0ll) this.I00iio, this.I00iiI, (IIlO0OOI1lI) this.I00ilI0I1), 3);
                }

                @Override
                public ListenableFuture call() {
/* 3 */             ll10Ii1io1I ll10ii1io1i = (ll10Ii1io1I) this.I00iiO;
/* 7 */             i1ilO0II i1ilo0ii = (i1ilO0II) this.I00iio;
/* 9 */             int i = this.I00iiI;
/* 13 */            ArrayList arrayList = (ArrayList) this.I00ilI0I1;
/* 15 */            Ioil1OOO ioil1OOOI0000Il00O = IlloOoiiO.I0000Il00O(i1ilo0ii);
/* 20 */            for (int i2 = 0; i2 < i; i2++) {
/* 38 */                if (((Boolean) IlloOoiiO.I00000oIO((Future) arrayList.get(i2))).booleanValue()) {
/* 47 */                    ((OOol0l1I1) ll10ii1io1i.I00000oOI).get(i2);
/* 50 */                    OIiilo1Ool0o.I00000oIO();
/* 53 */                    return null;
                        }
                    }
/* 55 */            return ioil1OOOI0000Il00O;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 2:
/* 11 */                    return I0000Il00O();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 154 */       public o00io0IiOOo0(int i) {
/* 155 */           this.I00iOIl = i;
                }

/* 155 */       public o00io0IiOOo0(int i, IIII0i iIII0i, Ii00l101O ii00l101O, IlOil1ii ilOil1ii) {
                    this.I00iOIl = 5;
/* 157 */           this.I00iiO = ilOil1ii;
/* 158 */           this.I00iiI = i;
/* 159 */           this.I00iio = iIII0i;
/* 160 */           this.I00ilI0I1 = ii00l101O;
                }
            }
