            package p000;
            
            public final class i1II10 implements Runnable {
                public final int I00iOIl;
                public String I00iiI;
                public long I00iiO;
                public il11ll0i I00iio;

                public i1II10(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 141 */                   il11ll0i il11ll0iVar = this.I00iio;
/* 143 */                   String str = this.I00iiI;
/* 145 */                   long j = this.I00iiO;
/* 147 */                   il11ll0iVar.I010II();
/* 150 */                   lII0I0I000I.I0000O(str);
/* 153 */                   I1Io0i0II i1Io0i0II = il11ll0iVar.I00iiO;
/* 159 */                   if (i1Io0i0II.isEmpty()) {
/* 161 */                       il11ll0iVar.I00iio = j;
                            }
/* 167 */                   Integer num = (Integer) i1Io0i0II.get(str);
/* 170 */                   if (num == null) {
/* 189 */                       if (i1Io0i0II.I00iiO < 100) {
/* 212 */                           i1Io0i0II.put(str, 1);
/* 221 */                           il11ll0iVar.I00iiI.put(str, Long.valueOf(j));
                                    break;
                                } else {
/* 195 */                           l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) il11ll0iVar.I00iOIl).I00ilO0;
/* 197 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 204 */                           l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Too many ads visible");
                                    break;
                                }
                            } else {
/* 181 */                       i1Io0i0II.put(str, Integer.valueOf(num.intValue() + 1));
                                break;
                            }
                        default:
/* 6 */                     il11ll0i il11ll0iVar2 = this.I00iio;
/* 8 */                     String str2 = this.I00iiI;
/* 10 */                    long j2 = this.I00iiO;
/* 12 */                    il11ll0iVar2.I010II();
/* 15 */                    lII0I0I000I.I0000O(str2);
/* 18 */                    I1Io0i0II i1Io0i0II2 = il11ll0iVar2.I00iiO;
/* 24 */                    Integer num2 = (Integer) i1Io0i0II2.get(str2);
/* 28 */                    l0olllO1i l0olllo1i = (l0olllO1i) il11ll0iVar2.I00iOIl;
/* 30 */                    if (num2 == null) {
/* 128 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 130 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 137 */                       l01o0io1ooo02.I00ilO0.I0000Il00O("Call to endAdUnitExposure for unknown ad unit id", str2);
                                break;
                            } else {
/* 32 */                        lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 34 */                        l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 36 */                        l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 40 */                        lIol0ili1Oi liol0ili1oiI010ioo = lo0liio0.I010ioo(false);
                                int iIntValue = num2.intValue() - 1;
/* 50 */                        if (iIntValue != 0) {
/* 124 */                           i1Io0i0II2.put(str2, Integer.valueOf(iIntValue));
                                    break;
                                } else {
/* 52 */                            i1Io0i0II2.remove(str2);
/* 55 */                            I1Io0i0II i1Io0i0II3 = il11ll0iVar2.I00iiI;
/* 61 */                            Long l = (Long) i1Io0i0II3.get(str2);
/* 63 */                            if (l == null) {
/* 65 */                                l0olllO1i.I000II(l01o0io1ooo03);
/* 72 */                                l01o0io1ooo03.I00ilO0.I00000oOI("First ad unit exposure time was never set");
                                    } else {
/* 80 */                                long jLongValue = j2 - l.longValue();
/* 82 */                                i1Io0i0II3.remove(str2);
/* 85 */                                il11ll0iVar2.I010l10O(str2, jLongValue, liol0ili1oiI010ioo);
                                    }
/* 92 */                            if (i1Io0i0II2.isEmpty()) {
/* 94 */                                long j3 = il11ll0iVar2.I00iio;
/* 100 */                               if (j3 != 0) {
/* 114 */                                   il11ll0iVar2.I010ioo(j2 - j3, liol0ili1oiI010ioo);
/* 117 */                                   il11ll0iVar2.I00iio = 0L;
                                            break;
                                        } else {
/* 102 */                                   l0olllO1i.I000II(l01o0io1ooo03);
/* 109 */                                   l01o0io1ooo03.I00ilO0.I00000oOI("First ad exposure time was never set");
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            }
