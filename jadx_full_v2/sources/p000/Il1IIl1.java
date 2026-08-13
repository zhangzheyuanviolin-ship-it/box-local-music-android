            package p000;
            
/* 44 */    public final class Il1IIl1 {
                public static final Il1IIl1 I0000Il00O = new Il1IIl1(false, 0);
                public int I00000oIO;
                public boolean I00000oOI;

                public Il1IIl1(byte[] bArr) {
/* 5 */             this.I00000oOI = false;
/* 7 */             this.I00000oIO = 0;
/* 13 */            int i = (bArr[0] & 255) << 8;
/* 15 */            this.I00000oIO = i;
/* 23 */            int i2 = (i | (bArr[1] & 255)) << 8;
/* 25 */            this.I00000oIO = i2;
/* 33 */            int i3 = (i2 | (bArr[2] & 255)) << 8;
/* 35 */            this.I00000oIO = i3;
/* 43 */            this.I00000oIO = (bArr[3] & 255) | i3;
                }

                public void I00000oIO(int i) {
/* 8 */             this.I00000oIO = (1 << (i - 1)) | this.I00000oIO;
                }

/* 45 */        public Il1IIl1(boolean z, int i) {
/* 47 */            this.I00000oOI = z;
/* 48 */            this.I00000oIO = i;
                }
            }
