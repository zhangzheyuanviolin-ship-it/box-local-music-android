            package p000;

            import java.util.Collections;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IO1oioi0 implements IllOOo00lI {
                public final int I00iOIl;
                public String I00iiI;
                public boolean I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public IO1oioi0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
                @Override
                public final Object invoke() {
                    CharSequence charSequenceSubSequence;
                    switch (this.I00iOIl) {
                        case 0:
/* 180 */                   String str = this.I00iiI;
/* 184 */                   String str2 = (String) this.I00iio;
/* 189 */                   String str3 = (String) this.I00ilI0I1;
/* 191 */                   boolean z = this.I00iiO;
/* 196 */                   String str4 = (String) this.I00ilO0;
/* 201 */                   IoiOolO1iOo ioiOolO1iOo = (IoiOolO1iOo) this.I00io1l;
/* 203 */                   Object obj = this.I00ioIO;
/* 205 */                   int length = str.length();
/* 209 */                   Il01100l il01100l = Il01100l.I00iOIl;
/* 227 */                   return new IO1OioOO1III(str3, z, str4, ioiOolO1iOo, length > 0 ? Collections.singletonList(new OOO10o0l0(str, str2)) : il01100l, il01100l, obj);
                        default:
/* 6 */                     String str5 = this.I00iiI;
/* 8 */                     boolean z2 = this.I00iiO;
/* 12 */                    Io1I0l io1I0l = (Io1I0l) this.I00iio;
/* 16 */                    Function1 function1 = (Function1) this.I00ilI0I1;
/* 20 */                    OI10i0Il oI10i0Il = (OI10i0Il) this.I00ilO0;
/* 24 */                    OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00io1l;
/* 28 */                    OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ioIO;
/* 34 */                    String string = OlOoOIi0o.I00OIo(str5).toString();
/* 42 */                    OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) oI10i0Il.getValue();
/* 45 */                    if (oIoi0IIoi != null) {
/* 74 */                        String str6 = "\n\n---\n📄 **Attached Document: " + oIoi0IIoi.I00iOIl + "**\n```\n" + oIoi0IIoi.I00iiI + "\n```\n---\n";
/* 82 */                        if (string.length() == 0) {
/* 85 */                            char[] cArr = {'\n'};
/* 91 */                            int length2 = str6.length();
/* 95 */                            int i = 0;
                                    while (true) {
/* 96 */                                if (i < length2) {
/* 98 */                                    char cCharAt = str6.charAt(i);
/* 102 */                                   int i2 = 0;
                                            while (true) {
/* 103 */                                       if (i2 >= 1) {
/* 113 */                                           i2 = -1;
                                                } else if (cCharAt != cArr[i2]) {
/* 110 */                                           i2++;
                                                }
                                            }
/* 114 */                                   if (i2 >= 0) {
/* 116 */                                       i++;
                                            } else {
/* 123 */                                       charSequenceSubSequence = str6.subSequence(i, str6.length());
                                            }
                                        } else {
/* 128 */                                   charSequenceSubSequence = "";
                                        }
                                    }
/* 130 */                           string = charSequenceSubSequence.toString();
                                } else {
/* 135 */                           string = string.concat(str6);
                                }
                            }
/* 139 */                   if (z2) {
/* 143 */                       ((OO1IIll00O) io1I0l).I00000oIO(0);
                            }
/* 162 */                   function1.invoke(l1O0o1.I0000oI00((List) oI10i0Il2.getValue(), (List) oI10i0Il3.getValue(), string));
/* 165 */                   Il01100l il01100l2 = Il01100l.I00iOIl;
/* 167 */                   oI10i0Il2.setValue(il01100l2);
/* 170 */                   oI10i0Il3.setValue(il01100l2);
/* 174 */                   oI10i0Il.setValue(null);
/* 177 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
