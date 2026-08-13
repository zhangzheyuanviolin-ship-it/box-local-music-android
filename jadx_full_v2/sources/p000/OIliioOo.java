            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.HashMap;
            
            public abstract class OIliioOo {
                public static final int[] I00000oIO = new int[Barcode.FORMAT_QR_CODE];
                public static final HashMap I00000oOI = new HashMap(Barcode.FORMAT_QR_CODE);

                static {
/* 15 */            for (int i = 0; i < 256; i++) {
/* 19 */                if ((i <= 23 || i >= 32) && ((i <= 126 || i >= 161) && i != 173)) {
/* 41 */                    I00000oIO((char) i, i);
                        }
                    }
/* 51 */            I00000oIO((char) 728, 24);
/* 58 */            I00000oIO((char) 711, 25);
/* 65 */            I00000oIO((char) 710, 26);
/* 72 */            I00000oIO((char) 729, 27);
/* 79 */            I00000oIO((char) 733, 28);
/* 86 */            I00000oIO((char) 731, 29);
/* 93 */            I00000oIO((char) 730, 30);
/* 100 */           I00000oIO((char) 732, 31);
/* 108 */           I00000oIO((char) 65533, 127);
/* 115 */           I00000oIO((char) 8226, Barcode.FORMAT_ITF);
/* 122 */           I00000oIO((char) 8224, 129);
/* 129 */           I00000oIO((char) 8225, 130);
/* 136 */           I00000oIO((char) 8230, 131);
/* 143 */           I00000oIO((char) 8212, 132);
/* 150 */           I00000oIO((char) 8211, 133);
/* 157 */           I00000oIO((char) 402, 134);
/* 164 */           I00000oIO((char) 8260, 135);
/* 171 */           I00000oIO((char) 8249, 136);
/* 178 */           I00000oIO((char) 8250, 137);
/* 185 */           I00000oIO((char) 8722, 138);
/* 192 */           I00000oIO((char) 8240, 139);
/* 199 */           I00000oIO((char) 8222, 140);
/* 206 */           I00000oIO((char) 8220, 141);
/* 213 */           I00000oIO((char) 8221, 142);
/* 220 */           I00000oIO((char) 8216, 143);
/* 227 */           I00000oIO((char) 8217, 144);
/* 234 */           I00000oIO((char) 8218, 145);
/* 241 */           I00000oIO((char) 8482, 146);
/* 249 */           I00000oIO((char) 64257, 147);
/* 257 */           I00000oIO((char) 64258, 148);
/* 264 */           I00000oIO((char) 321, 149);
/* 271 */           I00000oIO((char) 338, 150);
/* 278 */           I00000oIO((char) 352, 151);
/* 285 */           I00000oIO((char) 376, 152);
/* 292 */           I00000oIO((char) 381, 153);
/* 299 */           I00000oIO((char) 305, 154);
/* 306 */           I00000oIO((char) 322, 155);
/* 313 */           I00000oIO((char) 339, 156);
/* 320 */           I00000oIO((char) 353, 157);
/* 327 */           I00000oIO((char) 382, 158);
/* 332 */           I00000oIO((char) 65533, 159);
/* 339 */           I00000oIO((char) 8364, 160);
                }

                public static void I00000oIO(char c, int i) {
/* 3 */             I00000oIO[i] = c;
/* 15 */            I00000oOI.put(Character.valueOf(c), Integer.valueOf(i));
                }
            }
