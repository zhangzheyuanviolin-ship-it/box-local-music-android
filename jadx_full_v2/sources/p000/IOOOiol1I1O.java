            package p000;
            
            public final class IOOOiol1I1O {
                public final int[] I00000oIO;
                public final int[] I00000oOI;
                public final int I0000Il00O;

                public IOOOiol1I1O(byte[] bArr, byte[] bArr2) {
/* 5 */             this.I0000Il00O = 0;
/* 9 */             if (bArr.length != bArr2.length && bArr.length == 1 && bArr[0] == 0) {
/* 20 */                bArr = new byte[bArr2.length];
                    } else if (bArr.length != bArr2.length) {
/* 65 */                I000II.I000iOII("The start and the end values must not have different lengths.");
/* 89 */                throw null;
                    }
/* 30 */            this.I00000oIO = new int[bArr.length];
/* 35 */            this.I00000oOI = new int[bArr2.length];
/* 38 */            for (int i = 0; i < bArr.length; i++) {
/* 46 */                this.I00000oIO[i] = bArr[i] & 255;
/* 54 */                this.I00000oOI[i] = bArr2[i] & 255;
                    }
/* 60 */            this.I0000Il00O = bArr2.length;
                }
            }
