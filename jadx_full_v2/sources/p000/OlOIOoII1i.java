            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlOIOoII1i {
                public int I00000oIO;

                public static final OlOIOoII1i I00000oIO(int i) {
/* 3 */             OlOIOoII1i olOIOoII1i = new OlOIOoII1i();
/* 6 */             olOIOoII1i.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return olOIOoII1i;
                }

                public static final String I00000oOI(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return "UNKNOWN";
                    }
/* 8 */             if (i == 34) {
/* 10 */                return "PRIVATE";
                    }
/* 16 */            if (i == 1144402265) {
/* 18 */                return "DEPTH16";
                    }
/* 24 */            if (i == 1768253795) {
/* 26 */                return "DEPTH_JPEG";
                    }
/* 31 */            if (i == 257) {
/* 33 */                return "DEPTH_POINT_CLOUD";
                    }
/* 38 */            if (i == 41) {
/* 40 */                return "FLEX_RGB_888";
                    }
/* 45 */            if (i == 42) {
/* 47 */                return "FLEX_RGBA_8888";
                    }
/* 53 */            if (i == 1212500294) {
/* 55 */                return "HEIC";
                    }
/* 60 */            if (i == 256) {
/* 62 */                return "JPEG";
                    }
/* 67 */            if (i == 4101) {
/* 69 */                return "JPEG_R";
                    }
/* 74 */            if (i == 16) {
/* 76 */                return "NV16";
                    }
/* 81 */            if (i == 17) {
/* 83 */                return "NV21";
                    }
/* 88 */            if (i == 37) {
/* 90 */                return "RAW10";
                    }
/* 95 */            if (i == 38) {
/* 97 */                return "RAW12";
                    }
/* 102 */           if (i == 4098) {
/* 104 */               return "RAW_DEPTH";
                    }
/* 109 */           if (i == 36) {
/* 111 */               return "RAW_PRIVATE";
                    }
/* 116 */           if (i == 32) {
/* 118 */               return "RAW_SENSOR";
                    }
/* 122 */           if (i == 4) {
/* 124 */               return "RGB_565";
                    }
/* 130 */           if (i == 842094169) {
/* 132 */               return "Y12";
                    }
/* 138 */           if (i == 540422489) {
/* 140 */               return "Y16";
                    }
/* 146 */           if (i == 538982489) {
/* 148 */               return "Y8";
                    }
/* 153 */           if (i == 54) {
/* 155 */               return "YCBCR_P010";
                    }
/* 160 */           if (i == 35) {
/* 162 */               return "YUV_420_888";
                    }
/* 167 */           if (i == 39) {
/* 169 */               return "YUV_422_888";
                    }
/* 174 */           if (i == 40) {
/* 176 */               return "YUV_444_888";
                    }
/* 181 */           if (i == 20) {
/* 183 */               return "YUY2";
                    }
/* 186 */           if (i == 842094169) {
/* 188 */               return "YV12";
                    }
/* 195 */           StringBuilder sb = new StringBuilder("UNKNOWN(");
/* 198 */           iOlI1lIi0.I00000oIO(16);
/* 205 */           sb.append(Integer.toString(i, 16));
/* 208 */           sb.append(')');
/* 211 */           return sb.toString();
                }

                public static String I0000Il00O(int i) {
/* 20 */            return "StreamFormat(" + I00000oOI(i) + ')';
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OlOIOoII1i) && this.I00000oIO == ((OlOIOoII1i) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000Il00O(this.I00000oIO);
                }
            }
