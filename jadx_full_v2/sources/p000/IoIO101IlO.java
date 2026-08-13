            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public abstract class IoIO101IlO {
                public static final IIOIIi1ilIO I00000oIO;
                public static final String[] I00000oOI;
                public static final String[] I0000Il00O;
                public static final String[] I0000O;

                static {
/* 11 */            IIOIIi1ilIO iIOIIi1ilIO = new IIOIIi1ilIO("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(IO1IOI.I00000oIO));
/* 14 */            iIOIIi1ilIO.I00iiO = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
/* 16 */            I00000oIO = iIOIIi1ilIO;
/* 42 */            I00000oOI = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
/* 48 */            I0000Il00O = new String[64];
/* 52 */            String[] strArr = new String[Barcode.FORMAT_QR_CODE];
/* 58 */            for (int i = 0; i < 256; i++) {
/* 80 */                strArr[i] = OollIoI001lo.I000O01llI0("%8s", Integer.toBinaryString(i)).replace(' ', '0');
                    }
/* 85 */            I0000O = strArr;
/* 87 */            String[] strArr2 = I0000Il00O;
/* 91 */            strArr2[0] = "";
/* 96 */            strArr2[1] = "END_STREAM";
/* 98 */            int[] iArr = {1};
/* 106 */           strArr2[8] = "PADDED";
/* 108 */           int i2 = iArr[0];
/* 125 */           strArr2[i2 | 8] = IIl001iO0Io.I00100l0(new StringBuilder(), strArr2[i2], "|PADDED");
/* 130 */           strArr2[4] = "END_HEADERS";
/* 134 */           strArr2[32] = "PRIORITY";
/* 140 */           strArr2[36] = "END_HEADERS|PRIORITY";
/* 142 */           int[] iArr2 = {4, 32, 36};
/* 148 */           for (int i3 = 0; i3 < 3; i3++) {
/* 150 */               int i4 = iArr2[i3];
/* 152 */               int i5 = iArr[0];
/* 154 */               String[] strArr3 = I0000Il00O;
/* 156 */               int i6 = i5 | i4;
/* 182 */               strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
/* 187 */               StringBuilder sb = new StringBuilder();
/* 192 */               sb.append(strArr3[i5]);
/* 195 */               sb.append('|');
/* 204 */               strArr3[i6 | 8] = IIl001iO0Io.I00100l0(sb, strArr3[i4], "|PADDED");
                    }
/* 211 */           int length = I0000Il00O.length;
/* 212 */           for (int i7 = 0; i7 < length; i7++) {
/* 214 */               String[] strArr4 = I0000Il00O;
/* 218 */               if (strArr4[i7] == null) {
/* 224 */                   strArr4[i7] = I0000O[i7];
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String I00000oIO(boolean z, int i, int i2, int i3, int i4) {
                    String strI000iOII;
/* 1 */             String[] strArr = I00000oOI;
/* 19 */            String strI000O01llI0 = i3 < strArr.length ? strArr[i3] : OollIoI001lo.I000O01llI0("0x%02x", Integer.valueOf(i3));
/* 23 */            if (i4 == 0) {
/* 25 */                strI000iOII = "";
                    } else {
/* 29 */                String[] strArr2 = I0000O;
/* 31 */                if (i3 == 2 || i3 == 3) {
/* 101 */                   strI000iOII = strArr2[i4];
                        } else if (i3 == 4 || i3 == 6) {
/* 98 */                    strI000iOII = i4 == 1 ? "ACK" : strArr2[i4];
                        } else if (i3 != 7 && i3 != 8) {
/* 49 */                    String[] strArr3 = I0000Il00O;
/* 57 */                    String str = i4 < strArr3.length ? strArr3[i4] : strArr2[i4];
/* 90 */                    strI000iOII = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str : OlOolloIIOl0.I000iOII(str, "PRIORITY", "COMPRESSED") : OlOolloIIOl0.I000iOII(str, "HEADERS", "PUSH_PROMISE");
                        }
                    }
/* 124 */           return OollIoI001lo.I000O01llI0("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strI000O01llI0, strI000iOII);
                }
            }
