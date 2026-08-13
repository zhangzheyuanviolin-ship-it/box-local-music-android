            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.view.MenuItem;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            import java.security.MessageDigest;
            import java.util.HashMap;
            import java.util.HashSet;
            import javax.crypto.AEADBadTagException;
            
/* 18 */    public abstract class I01loIooI {
                public Object I00000oIO;
                public Object I00000oOI;

                public I01loIooI(int i) {
                    switch (i) {
                        case 5:
/* 41 */                    this.I00000oIO = new HashMap(250);
/* 48 */                    this.I00000oOI = new HashMap(250);
                            break;
                        case 6:
/* 21 */                    this.I00000oIO = iOOOIOoiIlII.I00000oOI(1);
/* 28 */                    this.I00000oOI = new IOi10loi();
                            break;
                        default:
/* 10 */                    this.I00000oOI = new int[2];
                            break;
                    }
                }

                public static byte[] I00100o1O0lo(ByteBuffer byteBuffer, byte[] bArr) {
/* 14 */            int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
/* 15 */            int iRemaining = byteBuffer.remaining();
/* 19 */            int i = iRemaining % 16;
/* 28 */            int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
/* 37 */            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
/* 41 */            byteBufferOrder.put(bArr);
/* 44 */            byteBufferOrder.position(length);
/* 47 */            byteBufferOrder.put(byteBuffer);
/* 50 */            byteBufferOrder.position(i2);
/* 55 */            byteBufferOrder.putLong(bArr.length);
/* 59 */            byteBufferOrder.putLong(iRemaining);
/* 62 */            return byteBufferOrder.array();
                }

                public void I0000O(int i, String str) {
/* 9 */             ((HashMap) this.I00000oIO).put(Integer.valueOf(i), str);
/* 20 */            ((HashMap) this.I00000oOI).put(str, Integer.valueOf(i));
                }

                public void I0000oI00() {
/* 3 */             I11o1li1O00 i11o1li1O00 = (I11o1li1O00) this.I00000oIO;
/* 5 */             if (i11o1li1O00 != null) {
                        try {
/* 13 */                    ((I11oi01ll) this.I00000oOI).I00ioIO.unregisterReceiver(i11o1li1O00);
                        } catch (IllegalArgumentException unused) {
                        }
/* 17 */                this.I00000oIO = null;
                    }
                }

                public void I0001Ioi1lo() {
/* 3 */             OlIIlIO1O olIIlIO1O = (OlIIlIO1O) this.I00000oIO;
/* 7 */             IIoi1Oi iIoi1Oi = (IIoi1Oi) this.I00000oOI;
/* 9 */             HashSet hashSet = olIIlIO1O.I0000oI00;
/* 15 */            if (hashSet.remove(iIoi1Oi) && hashSet.isEmpty()) {
/* 23 */                olIIlIO1O.I00000oOI();
                    }
                }

                public abstract Object I000II(String str);

                public abstract IntentFilter I000O01llI0();

                public byte[] I000OOo1O(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 7 */             if (byteBuffer.remaining() < 16) {
/* 118 */               IioIoO10iOiI.I000oI1ioi("ciphertext too short");
/* 121 */               return null;
                    }
/* 9 */             int iPosition = byteBuffer.position();
/* 13 */            byte[] bArr3 = new byte[16];
/* 20 */            byteBuffer.position(byteBuffer.limit() - 16);
/* 23 */            byteBuffer.get(bArr3);
/* 26 */            byteBuffer.position(iPosition);
/* 34 */            byteBuffer.limit(byteBuffer.limit() - 16);
/* 38 */            if (bArr2 == null) {
/* 40 */                bArr2 = new byte[0];
                    }
                    try {
/* 52 */                byte[] bArr4 = new byte[32];
/* 54 */                ((IOOOI0) this.I00000oOI).I00000oIO(0, bArr).get(bArr4);
/* 69 */                if (!MessageDigest.isEqual(lI1lO10O0i.I00000oIO(bArr4, I00100o1O0lo(byteBuffer, bArr2)), bArr3)) {
/* 104 */                   throw new GeneralSecurityException("invalid MAC");
                        }
/* 71 */                byteBuffer.position(iPosition);
/* 76 */                IOOOI0 ioooi0 = (IOOOI0) this.I00000oIO;
/* 78 */                ioooi0.getClass();
/* 85 */                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
/* 89 */                ioooi0.I000l1(bArr, byteBufferAllocate, byteBuffer);
/* 92 */                return byteBufferAllocate.array();
                    } catch (GeneralSecurityException e) {
/* 115 */               throw new AEADBadTagException(e.toString());
                    }
                }

                public void I000OiO(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
/* 10 */            if (byteBuffer.remaining() < bArr2.length + 16) {
/* 94 */                I000II.I000iOII("Given ByteBuffer output is too small");
/* 204 */               return;
                    }
/* 12 */            int iPosition = byteBuffer.position();
/* 18 */            IOOOI0 ioooi0 = (IOOOI0) this.I00000oIO;
/* 20 */            ioooi0.getClass();
/* 28 */            if (byteBuffer.remaining() < bArr2.length) {
/* 90 */                I000II.I000iOII("Given ByteBuffer output is too small");
/* 93 */                return;
                    }
/* 34 */            ioooi0.I000l1(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
/* 37 */            byteBuffer.position(iPosition);
/* 46 */            byteBuffer.limit(byteBuffer.limit() - 16);
/* 50 */            if (bArr3 == null) {
/* 52 */                bArr3 = new byte[0];
                    }
/* 58 */            ByteBuffer byteBufferI00000oIO = ((IOOOI0) this.I00000oOI).I00000oIO(0, bArr);
/* 64 */            byte[] bArr4 = new byte[32];
/* 66 */            byteBufferI00000oIO.get(bArr4);
/* 73 */            byte[] bArrI00000oIO = lI1lO10O0i.I00000oIO(bArr4, I00100o1O0lo(byteBuffer, bArr3));
/* 83 */            byteBuffer.limit(byteBuffer.limit() + 16);
/* 86 */            byteBuffer.put(bArrI00000oIO);
                }

                public abstract int[] I000iOII(int i);

                public abstract int I000l1();

                public MenuItem I000lI(MenuItem menuItem) {
/* 3 */             if (!(menuItem instanceof OliiollI)) {
/* 77 */                return menuItem;
                    }
/* 5 */             OliiollI oliiollI = (OliiollI) menuItem;
/* 9 */             Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) this.I00000oOI;
/* 11 */            if (ol0Ii10o1 == null) {
/* 16 */                ol0Ii10o1 = new Ol0Ii10o1(0);
/* 19 */                this.I00000oOI = ol0Ii10o1;
                    }
/* 25 */            MenuItem menuItem2 = (MenuItem) ol0Ii10o1.get(oliiollI);
/* 27 */            if (menuItem2 != null) {
/* 45 */                return menuItem2;
                    }
/* 35 */            O1ioi1oo0Ol o1ioi1oo0Ol = new O1ioi1oo0Ol((Context) this.I00000oIO, oliiollI);
/* 42 */            ((Ol0Ii10o1) this.I00000oOI).put(oliiollI, o1ioi1oo0Ol);
/* 45 */            return o1ioi1oo0Ol;
                }

                public int[] I000o00OoI0I(int i, int i2) {
/* 1 */             if (i < 0 || i2 < 0 || i == i2) {
/* 19 */                return null;
                    }
/* 10 */            int[] iArr = (int[]) this.I00000oOI;
/* 13 */            iArr[0] = i;
/* 16 */            iArr[1] = i2;
/* 18 */            return iArr;
                }

                public String I000oI1ioi() {
/* 3 */             String str = (String) this.I00000oIO;
/* 5 */             if (str != null) {
/* 7 */                 return str;
                    }
/* 10 */            O0000Ioio00.I000OOo1O("text");
/* 20 */            throw null;
                }

                public boolean I00100l0() {
                    return ((I1lo101oIi1) this.I00000oIO).I00000oOI && ((I1lo0oO1O) this.I00000oOI).I0000oI00;
                }

                public abstract IOOOI0 I0010I0i(int i, byte[] bArr);

                public abstract void I00111O();

                public abstract void I001i1O0Ol();

                public abstract int[] I001i1lo1io(int i);

                public void I001iOo1i0O() {
/* 1 */             I0000oI00();
/* 4 */             IntentFilter intentFilterI000O01llI0 = I000O01llI0();
/* 12 */            if (intentFilterI000O01llI0.countActions() == 0) {
/* 14 */                return;
                    }
/* 17 */            I11o1li1O00 i11o1li1O00 = (I11o1li1O00) this.I00000oIO;
/* 19 */            if (i11o1li1O00 == null) {
/* 24 */                i11o1li1O00 = new I11o1li1O00(this, 0);
/* 27 */                this.I00000oIO = i11o1li1O00;
                    }
/* 35 */            ((I11oi01ll) this.I00000oOI).I00ioIO.registerReceiver(i11o1li1O00, intentFilterI000O01llI0);
                }

/* 19 */        public void I0010o() {
                }

/* 19 */        public void I001IO000() {
                }

/* 28 */        public void I001IIilI0O(I1lloOo i1lloOo) {
                }

/* 50 */        public I01loIooI(Context context) {
/* 52 */            this.I00000oIO = context;
                }

/* 52 */        public I01loIooI(OII10lO0 oII10lO0) {
/* 54 */            this.I00000oIO = new I1lo101oIi1(this, 0);
/* 55 */            this.I00000oOI = new I1lo0oO1O(this, oII10lO0);
                }

/* 55 */        public I01loIooI(Object obj, Object obj2) {
/* 56 */            this.I00000oIO = obj;
                    this.I00000oOI = obj2;
                }

/* 56 */        public I01loIooI(I11oi01ll i11oi01ll) {
                    this.I00000oOI = i11oi01ll;
                }
            }
