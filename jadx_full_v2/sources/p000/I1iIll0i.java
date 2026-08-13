            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1iIll0i {
                public static final I1iIll0i I00iOIl;
                public static final I1iIll0i I00iiI;
                public static final I1iIll0i I00iiO;
                public static final I1iIll0i I00iio;
                public static final I1iIll0i I00ilI0I1;
                public static final I1iIll0i I00ilO0;
                public static final I1iIll0i I00io1l;
                public static final I1iIll0i[] I00ioIO;

                static {
/* 6 */             I1iIll0i i1iIll0i = new I1iIll0i("IDLE", 0);
/* 9 */             I00iOIl = i1iIll0i;
/* 16 */            I1iIll0i i1iIll0i2 = new I1iIll0i("RECORDING", 1);
/* 19 */            I00iiI = i1iIll0i2;
/* 26 */            I1iIll0i i1iIll0i3 = new I1iIll0i("DECODING", 2);
/* 29 */            I00iiO = i1iIll0i3;
/* 36 */            I1iIll0i i1iIll0i4 = new I1iIll0i("TRANSCRIBING", 3);
/* 39 */            I00iio = i1iIll0i4;
/* 46 */            I1iIll0i i1iIll0i5 = new I1iIll0i("DIARIZING", 4);
/* 49 */            I00ilI0I1 = i1iIll0i5;
/* 56 */            I1iIll0i i1iIll0i6 = new I1iIll0i("DONE", 5);
/* 59 */            I00ilO0 = i1iIll0i6;
/* 66 */            I1iIll0i i1iIll0i7 = new I1iIll0i("ERROR", 6);
/* 69 */            I00io1l = i1iIll0i7;
/* 71 */            I1iIll0i[] i1iIll0iArr = {i1iIll0i, i1iIll0i2, i1iIll0i3, i1iIll0i4, i1iIll0i5, i1iIll0i6, i1iIll0i7};
/* 75 */            I00ioIO = i1iIll0iArr;
/* 77 */            ilIII1o11.I00000oIO(i1iIll0iArr);
                }

                public static I1iIll0i valueOf(String str) {
/* 7 */             return (I1iIll0i) Enum.valueOf(I1iIll0i.class, str);
                }

                public static I1iIll0i[] values() {
/* 7 */             return (I1iIll0i[]) I00ioIO.clone();
                }
            }
