            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I11IIO00 {
                public static final I11IIO00 I00iiI;
                public static final I11IIO00 I00iiO;
                public static final I11IIO00 I00iio;
                public static final I11IIO00 I00ilI0I1;
                public static final I11IIO00 I00ilO0;
                public static final I11IIO00 I00io1l;
                public static final I11IIO00 I00ioIO;
                public static final I11IIO00 I00l0I0l0lO1;
                public static final I11IIO00 I00l0OO0IO;
                public static final I11IIO00[] I00li1OI;
                public final String I00iOIl;

                static {
/* 7 */             I11IIO00 i11iio00 = new I11IIO00("ALL", 0, null);
/* 15 */            I11IIO00 i11iio002 = new I11IIO00("FIELD", 1, null);
/* 18 */            I00iiI = i11iio002;
/* 25 */            I11IIO00 i11iio003 = new I11IIO00("FILE", 2, null);
/* 28 */            I00iiO = i11iio003;
/* 36 */            I11IIO00 i11iio004 = new I11IIO00("PROPERTY", 3, null);
/* 39 */            I00iio = i11iio004;
/* 49 */            I11IIO00 i11iio005 = new I11IIO00("PROPERTY_GETTER", 4, "get");
/* 52 */            I00ilI0I1 = i11iio005;
/* 62 */            I11IIO00 i11iio006 = new I11IIO00("PROPERTY_SETTER", 5, "set");
/* 65 */            I00ilO0 = i11iio006;
/* 73 */            I11IIO00 i11iio007 = new I11IIO00("RECEIVER", 6, null);
/* 76 */            I00io1l = i11iio007;
/* 85 */            I11IIO00 i11iio008 = new I11IIO00("CONSTRUCTOR_PARAMETER", 7, "param");
/* 88 */            I00ioIO = i11iio008;
/* 98 */            I11IIO00 i11iio009 = new I11IIO00("SETTER_PARAMETER", 8, "setparam");
/* 101 */           I00l0I0l0lO1 = i11iio009;
/* 111 */           I11IIO00 i11iio0010 = new I11IIO00("PROPERTY_DELEGATE_FIELD", 9, "delegate");
/* 114 */           I00l0OO0IO = i11iio0010;
/* 116 */           I11IIO00[] i11iio00Arr = {i11iio00, i11iio002, i11iio003, i11iio004, i11iio005, i11iio006, i11iio007, i11iio008, i11iio009, i11iio0010};
/* 120 */           I00li1OI = i11iio00Arr;
/* 122 */           ilIII1o11.I00000oIO(i11iio00Arr);
                }

                public I11IIO00(String str, int i, String str2) {
/* 14 */            this.I00iOIl = str2 == null ? iOl0l0o0o.I0000Il00O(name()) : str2;
                }

                public static I11IIO00 valueOf(String str) {
/* 7 */             return (I11IIO00) Enum.valueOf(I11IIO00.class, str);
                }

                public static I11IIO00[] values() {
/* 7 */             return (I11IIO00[]) I00li1OI.clone();
                }
            }
