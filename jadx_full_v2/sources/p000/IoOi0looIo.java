            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.EOFException;
            import java.io.IOException;
            import java.io.OutputStream;
            import java.util.ArrayList;
            import java.util.List;
            
/* 14 */    public final class IoOi0looIo implements I1IOO010, OIOlOI, Ooo1oiI0 {
                public int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public IoOi0looIo() {
/* 8 */             this.I00iiO = new IoOi0looIo[Barcode.FORMAT_QR_CODE];
/* 11 */            this.I00iOIl = 0;
/* 13 */            this.I00iiI = 0;
                }

                public static Number I0010o(int i, Ii11iIi ii11iIi) throws EOFException {
/* 3 */             if (i == 28) {
/* 10 */                return Integer.valueOf((short) ii11iIi.I000II());
                    }
/* 17 */            if (i >= 32 && i <= 246) {
/* 25 */                return Integer.valueOf(i - 139);
                    }
/* 32 */            if (i >= 247 && i <= 250) {
/* 48 */                return Integer.valueOf(((i - 247) * Barcode.FORMAT_QR_CODE) + ii11iIi.I0001Ioi1lo() + 108);
                    }
/* 55 */            if (i >= 251 && i <= 254) {
/* 72 */                return Integer.valueOf((((-(i - 251)) * Barcode.FORMAT_QR_CODE) - ii11iIi.I0001Ioi1lo()) - 108);
                    }
/* 79 */            if (i != 255) {
/* 104 */               OIiilo1Ool0o.I00100o1O0lo();
/* 107 */               return null;
                    }
/* 99 */            return Double.valueOf(((short) ii11iIi.I000II()) + (ii11iIi.I000II() / 65535.0d));
                }

                @Override
                public void I0000Il00O(int i, Object obj) {
/* 14 */            ((I1IOO010) this.I00iiO).I0000Il00O(i + (this.I00iiI == 0 ? this.I00iOIl : 0), obj);
                }

                @Override
                public void I0000O(Object obj) {
                    this.I00iiI++;
/* 11 */            ((I1IOO010) this.I00iiO).I0000O(obj);
                }

                @Override
                public void I0000oI00() {
/* 5 */             ((I1IOO010) this.I00iiO).I0000oI00();
                }

                @Override
                public void I0001Ioi1lo(int i, int i2, int i3) {
/* 8 */             int i4 = this.I00iiI == 0 ? this.I00iOIl : 0;
/* 15 */            ((I1IOO010) this.I00iiO).I0001Ioi1lo(i + i4, i2 + i4, i3);
                }

                @Override
                public void I000II(int i, int i2) {
/* 14 */            ((I1IOO010) this.I00iiO).I000II(i + (this.I00iiI == 0 ? this.I00iOIl : 0), i2);
                }

                @Override
                public int I000O01llI0(int i) {
/* 5 */             int iI000O01llI0 = ((OIOlOI) this.I00iiO).I000O01llI0(i);
/* 9 */             if (i >= 0 && i <= this.I00iiI) {
/* 17 */                Oolo0ioool.I0000Il00O(iI000O01llI0, this.I00iOIl, i);
                    }
/* 49 */            return iI000O01llI0;
                }

                @Override
                public void I000OOo1O() {
/* 3 */             if (this.I00iiI <= 0) {
/* 8 */                 IOl1II00.I00000oIO("OffsetApplier up called with no corresponding down");
                    }
                    this.I00iiI--;
/* 21 */            ((I1IOO010) this.I00iiO).I000OOo1O();
                }

                @Override
                public void I000OiO(int i, Object obj) {
/* 14 */            ((I1IOO010) this.I00iiO).I000OiO(i + (this.I00iiI == 0 ? this.I00iOIl : 0), obj);
                }

                @Override
                public Object I000l1() {
/* 5 */             return ((I1IOO010) this.I00iiO).I000l1();
                }

                @Override
                public void I000lI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 5 */             ((I1IOO010) this.I00iiO).I000lI(illiIl1l11O, obj);
                }

                @Override
                public int I000o00OoI0I(int i) {
/* 5 */             int iI000o00OoI0I = ((OIOlOI) this.I00iiO).I000o00OoI0I(i);
/* 9 */             if (i >= 0 && i <= this.I00iOIl) {
/* 17 */                Oolo0ioool.I00000oOI(iI000o00OoI0I, this.I00iiI, i);
                    }
/* 49 */            return iI000o00OoI0I;
                }

                @Override
                public I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 10 */            return ((OillOo0) this.I00iiO).I000oI1ioi(j, i110ooool, i110ooool2, i110ooool3);
                }

                public List I00100l0(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z) throws EOFException {
/* 2 */             if (z) {
/* 4 */                 this.I00iOIl = 0;
/* 6 */                 this.I00iiI = 0;
/* 13 */                this.I00iiO = new ArrayList();
                    }
/* 17 */            Ii11iIi ii11iIi = new Ii11iIi(bArr);
/* 28 */            boolean z2 = bArr3 != null && bArr3.length > 0;
/* 36 */            boolean z3 = bArr2 != null && bArr2.length > 0;
/* 42 */            while (ii11iIi.I0000Il00O < ii11iIi.I00000oOI.length) {
/* 44 */                int iI0001Ioi1lo = ii11iIi.I0001Ioi1lo();
/* 52 */                int i = 32768;
/* 64 */                if (iI0001Ioi1lo == 10 && z2) {
/* 76 */                    Integer num = (Integer) IIlIOloOOO.I000o00OoI0I(1, (ArrayList) this.I00iiO);
/* 78 */                    int length = bArr3.length;
/* 79 */                    if (length < 1240) {
/* 81 */                        i = 107;
                            } else if (length < 33900) {
/* 85 */                        i = 1131;
                            }
/* 90 */                    int iIntValue = num.intValue() + i;
/* 92 */                    if (iIntValue < bArr3.length) {
/* 96 */                        I00100l0(bArr3[iIntValue], bArr2, bArr3, false);
/* 103 */                       Object objI000OiO = IIl001iO0Io.I000OiO(1, (ArrayList) this.I00iiO);
/* 109 */                       if ((objI000OiO instanceof IO1I000) && ((IO1I000) objI000OiO).I00000oIO.I00000oIO[0] == 11) {
/* 123 */                           ArrayList arrayList = (ArrayList) this.I00iiO;
/* 130 */                           arrayList.remove(arrayList.size() - 1);
                                }
                            }
                        } else if (iI0001Ioi1lo == 29 && z3) {
/* 148 */                   Integer num2 = (Integer) IIlIOloOOO.I000o00OoI0I(1, (ArrayList) this.I00iiO);
/* 150 */                   int length2 = bArr2.length;
/* 151 */                   if (length2 < 1240) {
/* 153 */                       i = 107;
                            } else if (length2 < 33900) {
/* 157 */                       i = 1131;
                            }
/* 162 */                   int iIntValue2 = num2.intValue() + i;
/* 164 */                   if (iIntValue2 < bArr2.length) {
/* 168 */                       I00100l0(bArr2[iIntValue2], bArr2, bArr3, false);
/* 175 */                       Object objI000OiO2 = IIl001iO0Io.I000OiO(1, (ArrayList) this.I00iiO);
/* 181 */                       if ((objI000OiO2 instanceof IO1I000) && ((IO1I000) objI000OiO2).I00000oIO.I00000oIO[0] == 11) {
/* 195 */                           ArrayList arrayList2 = (ArrayList) this.I00iiO;
/* 202 */                           arrayList2.remove(arrayList2.size() - 1);
                                }
                            }
                        } else if (iI0001Ioi1lo >= 0 && iI0001Ioi1lo <= 27) {
/* 221 */                   ((ArrayList) this.I00iiO).add(I0010I0i(iI0001Ioi1lo, ii11iIi));
                        } else if (iI0001Ioi1lo == 28) {
/* 238 */                   ((ArrayList) this.I00iiO).add(I0010o(iI0001Ioi1lo, ii11iIi));
                        } else if (iI0001Ioi1lo >= 29 && iI0001Ioi1lo <= 31) {
/* 257 */                   ((ArrayList) this.I00iiO).add(I0010I0i(iI0001Ioi1lo, ii11iIi));
                        } else {
/* 264 */                   if (iI0001Ioi1lo < 32 || iI0001Ioi1lo > 255) {
/* 283 */                       OIiilo1Ool0o.I00100o1O0lo();
/* 286 */                       return null;
                            }
/* 278 */                   ((ArrayList) this.I00iiO).add(I0010o(iI0001Ioi1lo, ii11iIi));
                        }
                    }
/* 290 */           return (ArrayList) this.I00iiO;
                }

                public ArrayList I00100o1O0lo() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            int size = ((ArrayList) this.I00iiO).size();
                    while (true) {
                        size--;
/* 17 */                if (size <= -1) {
                            break;
                        }
/* 23 */                Object obj = ((ArrayList) this.I00iiO).get(size);
/* 29 */                if (!(obj instanceof Number)) {
                            break;
                        }
/* 35 */                arrayList.add(0, (Number) obj);
                    }
/* 113 */           return arrayList;
                }

                public IO1I000 I0010I0i(int i, Ii11iIi ii11iIi) {
/* 6 */             if (i == 1 || i == 18) {
/* 53 */                this.I00iOIl = (I00100o1O0lo().size() / 2) + this.I00iOIl;
                    } else if (i == 3 || i == 19 || i == 20 || i == 23) {
/* 37 */                this.I00iiI = (I00100o1O0lo().size() / 2) + this.I00iiI;
                    }
/* 57 */            if (i == 12) {
/* 65 */                return new IO1I000(i, ii11iIi.I0001Ioi1lo());
                    }
/* 69 */            if (i != 19 && i != 20) {
/* 76 */                return new IO1I000(i);
                    }
/* 84 */            int i2 = this.I00iOIl + this.I00iiI;
/* 85 */            int i3 = i2 / 8;
/* 89 */            if (i2 % 8 > 0) {
/* 91 */                i3++;
                    }
/* 93 */            int i4 = i3 + 1;
/* 94 */            int[] iArr = new int[i4];
/* 97 */            iArr[0] = i;
/* 99 */            for (int i5 = 1; i5 < i4; i5++) {
/* 105 */               iArr[i5] = ii11iIi.I0001Ioi1lo();
                    }
/* 112 */           IO1I000 io1i000 = new IO1I000();
/* 117 */           IO11ol11Ol iO11ol11Ol = new IO11ol11Ol();
/* 120 */           iO11ol11Ol.I00000oIO = iArr;
/* 122 */           io1i000.I00000oIO = iO11ol11Ol;
/* 551 */           return io1i000;
                }

                public void I00111O(byte[] bArr) {
/* 3 */             int[] iArr = (int[]) this.I00iiO;
/* 6 */             this.I00iOIl = 0;
/* 8 */             this.I00iiI = 0;
/* 12 */            if (bArr.length < 1 || bArr.length > 32) {
/* 61 */                I000II.I000iOII("number of bytes must be between 1 and 32");
/* 186 */               return;
                    }
/* 21 */            for (int i = 0; i < iArr.length; i++) {
/* 23 */                iArr[i] = i;
                    }
/* 28 */            int length = 0;
/* 29 */            int i2 = 0;
/* 31 */            for (int i3 = 0; i3 < iArr.length; i3++) {
/* 33 */                int i4 = bArr[length];
/* 35 */                if (i4 < 0) {
/* 37 */                    i4 += Barcode.FORMAT_QR_CODE;
                        }
/* 39 */                int i5 = iArr[i3];
/* 43 */                i2 = ((i4 + i5) + i2) % Barcode.FORMAT_QR_CODE;
/* 47 */                iArr[i3] = iArr[i2];
/* 49 */                iArr[i2] = i5;
/* 54 */                length = (length + 1) % bArr.length;
                    }
                }

                public void I001IIilI0O(byte b, OutputStream outputStream) throws IOException {
/* 5 */             int i = (this.I00iOIl + 1) % Barcode.FORMAT_QR_CODE;
/* 7 */             this.I00iOIl = i;
/* 11 */            int[] iArr = (int[]) this.I00iiO;
/* 13 */            int i2 = iArr[i];
/* 18 */            int i3 = (this.I00iiI + i2) % Barcode.FORMAT_QR_CODE;
/* 20 */            this.I00iiI = i3;
/* 24 */            iArr[i] = iArr[i3];
/* 26 */            iArr[i3] = i2;
/* 37 */            outputStream.write(((byte) iArr[(iArr[i] + i2) % Barcode.FORMAT_QR_CODE]) ^ b);
                }

                public synchronized int I001IO000() {
/* 2 */             int i = this.I00iiI;
/* 4 */             if (i != 0) {
/* 7 */                 return i;
                    }
/* 10 */            Context context = (Context) this.I00iiO;
/* 12 */            PackageManager packageManager = context.getPackageManager();
/* 36 */            if (i01l1OO001.I00000oIO(context).I00000oIO.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
/* 42 */                Log.e("Metadata", "Google Play services missing or without correct permission.");
/* 35 */                return 0;
                    }
/* 53 */            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
/* 58 */            intent.setPackage("com.google.android.gms");
/* 61 */            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
/* 66 */            if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
/* 74 */                this.I00iiI = 2;
/* 65 */                return 2;
                    }
/* 82 */            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
/* 85 */            this.I00iiI = 2;
/* 65 */            return 2;
                }

                public synchronized int I001i1O0Ol() {
                    PackageInfo packageInfoI0000Il00O;
/* 4 */             if (this.I00iOIl == 0) {
                        try {
/* 17 */                    packageInfoI0000Il00O = i01l1OO001.I00000oIO((Context) this.I00iiO).I0000Il00O(0, "com.google.android.gms");
                        } catch (PackageManager.NameNotFoundException e) {
/* 37 */                    Log.w("Metadata", "Failed to find package ".concat(e.toString()));
/* 40 */                    packageInfoI0000Il00O = null;
                        }
/* 41 */                if (packageInfoI0000Il00O != null) {
/* 45 */                    this.I00iOIl = packageInfoI0000Il00O.versionCode;
                        }
                    }
/* 47 */            return this.I00iOIl;
                }

                @Override
                public int I001lllioOl() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public int I00IOO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 10 */            return ((OillOo0) this.I00iiO).I00Io1lO(j, i110ooool, i110ooool2, i110ooool3);
                }

/* 15 */        public IoOi0looIo(OIOlOI oIOlOI, int i, int i2) {
/* 17 */            this.I00iiO = oIOlOI;
/* 18 */            this.I00iOIl = i;
/* 19 */            this.I00iiI = i2;
                }
            }
