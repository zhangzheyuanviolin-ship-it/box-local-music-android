            package p000;

            import android.graphics.BlendModeColorFilter;
            import androidx.work.impl.model.WorkSpec;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class I0o0iioo0IO implements Function1 {
                public final int I00iOIl;
                public long I00iiI;

                public I0o0iioo0IO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    IIoOoIol0Io0 iIoOoIol0Io0;
                    Object objI00000oIO;
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
                    int i;
                    int i2;
                    Integer numValueOf;
                    Boolean boolValueOf;
/* 3 */             int i3 = this.I00iOIl;
/* 16 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i3) {
                        case 0:
/* 1077 */                  long j = this.I00iiI;
/* 1081 */                  IIi11Illi1I iIi11Illi1I = (IIi11Illi1I) obj;
/* 1096 */                  float fIntBitsToFloat = Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() >> 32)) / 2.0f;
/* 1097 */                  I0oO00o i0oO00oI0000O = iOIloO1oiO.I0000O(iIi11Illi1I, fIntBitsToFloat);
/* 1117 */                  II0oIl iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(j), iOIill.I00000oIO(5)));
/* 1120 */                  iI0oIl.I00000oOI = j;
/* 1122 */                  iI0oIl.I0000Il00O = 5;
/* 1124 */                  VarHandle.storeStoreFence();
/* 1130 */                  I0i1l00llOi1 i0i1l00llOi1 = new I0i1l00llOi1(1);
/* 1133 */                  i0i1l00llOi1.I00iiI = fIntBitsToFloat;
/* 1135 */                  i0i1l00llOi1.I00iiO = i0oO00oI0000O;
/* 1137 */                  i0i1l00llOi1.I00iio = iI0oIl;
/* 1139 */                  VarHandle.storeStoreFence();
/* 1142 */                  return iIi11Illi1I.I00000oOI(i0i1l00llOi1);
                        case 1:
/* 998 */                   long j2 = this.I00iiI;
/* 1002 */                  IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 1016 */                  float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) - 2.0f;
/* 1072 */                  IilloIOOO0i.I00oli(iilloIOOO0i, j2, (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), 2.0f, 0, iOIloO1l10o.I00000oIO(new float[]{8.0f, 8.0f}), 464);
/* 1075 */                  return ooiIlOl1iI;
                        case 2:
/* 965 */                   long j3 = this.I00iiI;
/* 969 */                   III10o iII10o = (III10o) obj;
/* 971 */                   Function1 function1 = iII10o.I00000oOI;
/* 973 */                   if (function1 != null && (iIoOoIol0Io0 = iII10o.I00000oIO) != null) {
                                try {
/* 984 */                           objI00000oIO = function1.invoke(Long.valueOf(j3));
                                } catch (Throwable th) {
/* 990 */                           objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                                }
/* 994 */                       iIoOoIol0Io0.resumeWith(objI00000oIO);
                            }
/* 997 */                   return ooiIlOl1iI;
                        case 3:
/* 961 */                   ((Oil0O0I) obj).I00000oOI(Oiil1O.I00000oIO, new Oiil0Ol1(Io11Oll.I00iOIl, this.I00iiI, OiiioO1O1i1l.I00iiI, true));
/* 964 */                   return ooiIlOl1iI;
                        case 4:
/* 915 */                   long j4 = this.I00iiI;
/* 923 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM faces WHERE id = ?");
                            try {
/* 928 */                       oiIIl0O1l0lI00000oIO.I000OiO(1, j4);
/* 931 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 937 */                       return ooiIlOl1iI;
                            } finally {
/* 939 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        case 5:
/* 910 */                   return ((O1iIo0ll) obj).I001lllioOl(this.I00iiI);
                        case 6:
/* 900 */                   ((OI0ooi10l) obj).I0000O(Io1Ooo1.I00000oOI, Long.valueOf(this.I00iiI));
/* 886 */                   return null;
                        case 7:
/* 830 */                   IilloIOOO0i iilloIOOO0i2 = (IilloIOOO0i) obj;
/* 882 */                   IilloIOOO0i.I00oli(iilloIOOO0i2, this.I00iiI, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (iilloIOOO0i2.I0000oI00() & 4294967295L))) & 4294967295L), iilloIOOO0i2.I00i0ilIl0i(2.0f), 0, null, 496);
/* 885 */                   return ooiIlOl1iI;
                        case 8:
/* 722 */                   long j5 = this.I00iiI;
/* 726 */                   IilloIOOO0i iilloIOOO0i3 = (IilloIOOO0i) obj;
/* 744 */                   float fMin = Math.min(iilloIOOO0i3.I00i0ilIl0i(4.0f), Float.intBitsToFloat((int) (iilloIOOO0i3.I0000oI00() & 4294967295L)));
/* 750 */                   float fI00i0ilIl0i = iilloIOOO0i3.I00i0ilIl0i(6.0f);
/* 765 */                   float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (4294967295L & iilloIOOO0i3.I0000oI00())) - fMin) / 2.0f;
/* 768 */                   if (fIntBitsToFloat3 <= fI00i0ilIl0i) {
/* 771 */                       fI00i0ilIl0i = fIntBitsToFloat3;
                            }
/* 778 */                   if (iilloIOOO0i3.getLayoutDirection() == O0iOOoiioO.I00iiI) {
/* 780 */                       long jI00lli11 = iilloIOOO0i3.I00lli11();
/* 784 */                       IOO000ilo iOO000iloI00iiI = iilloIOOO0i3.I00iiI();
/* 788 */                       long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 796 */                       iOO000iloI00iiI.I0010o().I000II();
                                try {
/* 807 */                           ((IIOOoll) iOO000iloI00iiI.I00iiI).I00i01iIIliI(-1.0f, 1.0f, jI00lli11);
/* 810 */                           lIIo10.I00000oIO(iilloIOOO0i3, j5, fMin, fI00i0ilIl0i);
                                } finally {
/* 818 */                           IIlIOloOOO.I001IO000(iOO000iloI00iiI, jI001iOo1i0O);
                                }
                            } else {
/* 822 */                       lIIo10.I00000oIO(iilloIOOO0i3, j5, fMin, fI00i0ilIl0i);
                            }
/* 825 */                   return ooiIlOl1iI;
                        default:
/* 21 */                    long j6 = this.I00iiI;
/* 29 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                            try {
/* 33 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, j6);
/* 38 */                        int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 44 */                        int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 50 */                        int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 56 */                        int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 62 */                        int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 68 */                        int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 74 */                        int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 80 */                        int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 86 */                        int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 92 */                        int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 98 */                        int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 104 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 110 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 118 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 124 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 132 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 140 */                       int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 148 */                       int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 156 */                       int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 164 */                       int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 172 */                       int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 180 */                       int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 188 */                       int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 196 */                       int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 204 */                       int iI00000oIO25 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 212 */                       int iI00000oIO26 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 220 */                       int iI00000oIO27 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 228 */                       int iI00000oIO28 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 236 */                       int iI00000oIO29 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 244 */                       int iI00000oIO30 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 252 */                       int iI00000oIO31 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 260 */                       int iI00000oIO32 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 268 */                       int iI00000oIO33 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 276 */                       ArrayList arrayList = new ArrayList();
/* 283 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 285 */                           String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO);
/* 289 */                           int i4 = iI00000oIO12;
/* 291 */                           int i5 = iI00000oIO13;
/* 298 */                           i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO2));
/* 302 */                           String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3);
/* 306 */                           String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4);
/* 310 */                           byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO5);
/* 314 */                           Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 316 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 324 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO6));
/* 328 */                           long j7 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7);
/* 332 */                           long j8 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO8);
/* 336 */                           long j9 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO9);
/* 344 */                           int i6 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO10);
/* 345 */                           int i7 = iI00000oIO;
/* 346 */                           int i8 = iI00000oIO2;
/* 353 */                           I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO11));
/* 359 */                           long j10 = oiIIl0O1l0lI00000oIO.getLong(i4);
/* 365 */                           long j11 = oiIIl0O1l0lI00000oIO.getLong(i5);
/* 369 */                           long j12 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO14);
/* 375 */                           int i9 = iI00000oIO15;
/* 377 */                           long j13 = oiIIl0O1l0lI00000oIO.getLong(i9);
/* 381 */                           iI00000oIO15 = i9;
/* 383 */                           int i10 = iI00000oIO14;
/* 385 */                           int i11 = iI00000oIO16;
/* 387 */                           int i12 = iI00000oIO3;
/* 403 */                           boolean z = ((int) oiIIl0O1l0lI00000oIO.getLong(i11)) != 0;
/* 398 */                           int i13 = iI00000oIO17;
/* 400 */                           int i14 = iI00000oIO4;
/* 411 */                           OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i13));
/* 416 */                           int i15 = iI00000oIO18;
/* 424 */                           int i16 = (int) oiIIl0O1l0lI00000oIO.getLong(i15);
/* 427 */                           int i17 = iI00000oIO19;
/* 435 */                           int i18 = (int) oiIIl0O1l0lI00000oIO.getLong(i17);
/* 438 */                           long j14 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO20);
/* 446 */                           int i19 = iI00000oIO21;
/* 452 */                           int i20 = (int) oiIIl0O1l0lI00000oIO.getLong(i19);
/* 455 */                           int i21 = iI00000oIO22;
/* 463 */                           int i22 = (int) oiIIl0O1l0lI00000oIO.getLong(i21);
/* 464 */                           int i23 = iI00000oIO23;
/* 479 */                           String strI00i0O4 = oiIIl0O1l0lI00000oIO.isNull(i23) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i23);
/* 476 */                           int i24 = iI00000oIO24;
/* 490 */                           if (oiIIl0O1l0lI00000oIO.isNull(i24)) {
/* 492 */                               i = i20;
/* 494 */                               i2 = i21;
/* 496 */                               numValueOf = null;
                                    } else {
/* 499 */                               i = i20;
/* 501 */                               i2 = i21;
/* 508 */                               numValueOf = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i24));
                                    }
/* 512 */                           if (numValueOf != null) {
/* 523 */                               boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    } else {
/* 538 */                               boolValueOf = null;
                                    }
/* 529 */                           iI00000oIO24 = i24;
/* 532 */                           int i25 = iI00000oIO25;
/* 546 */                           OIIOlI oIIOlII0000oI00 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i25));
/* 550 */                           int i26 = iI00000oIO26;
/* 556 */                           OIIOOo oIIOOoI000l1 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i26));
/* 560 */                           iI00000oIO25 = i25;
/* 564 */                           int i27 = iI00000oIO27;
/* 581 */                           boolean z2 = ((int) oiIIl0O1l0lI00000oIO.getLong(i27)) != 0;
/* 576 */                           iI00000oIO27 = i27;
/* 578 */                           int i28 = iI00000oIO28;
/* 599 */                           boolean z3 = ((int) oiIIl0O1l0lI00000oIO.getLong(i28)) != 0;
/* 593 */                           iI00000oIO28 = i28;
/* 596 */                           int i29 = iI00000oIO29;
/* 617 */                           boolean z4 = ((int) oiIIl0O1l0lI00000oIO.getLong(i29)) != 0;
/* 611 */                           iI00000oIO29 = i29;
/* 614 */                           int i30 = iI00000oIO30;
/* 629 */                           int i31 = iI00000oIO31;
/* 639 */                           int i32 = iI00000oIO32;
/* 645 */                           iI00000oIO31 = i31;
/* 647 */                           int i33 = iI00000oIO33;
/* 675 */                           arrayList.add(new WorkSpec(strI00i0O, i01ioio1loI000II, strI00i0O2, strI00i0O3, ii11I1OOII1I00000oIO, ii11I1OOII1I00000oIO2, j7, j8, j9, new IOo0o10i1IO(oIIOOoI000l1, oIIOlII0000oI00, z2, z3, z4, ((int) oiIIl0O1l0lI00000oIO.getLong(i30)) != 0, oiIIl0O1l0lI00000oIO.getLong(i31), oiIIl0O1l0lI00000oIO.getLong(i32), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i33))), i6, i1o1O1Ii1l0lI0000O, j10, j11, j12, j13, z, oIio0Ii1IiI0001Ioi1lo, i16, i18, j14, i, i22, strI00i0O4, boolValueOf));
/* 678 */                           iI00000oIO33 = i33;
/* 680 */                           iI00000oIO32 = i32;
/* 682 */                           iI00000oIO30 = i30;
/* 684 */                           iI00000oIO = i7;
/* 685 */                           iI00000oIO12 = i4;
/* 687 */                           iI00000oIO14 = i10;
/* 689 */                           iI00000oIO2 = i8;
/* 691 */                           iI00000oIO13 = i5;
/* 692 */                           iI00000oIO4 = i14;
/* 694 */                           iI00000oIO17 = i13;
/* 696 */                           iI00000oIO19 = i17;
/* 698 */                           iI00000oIO21 = i19;
/* 700 */                           iI00000oIO22 = i2;
/* 702 */                           iI00000oIO23 = i23;
/* 704 */                           iI00000oIO26 = i26;
/* 706 */                           iI00000oIO3 = i12;
/* 708 */                           iI00000oIO16 = i11;
/* 710 */                           iI00000oIO18 = i15;
                                }
/* 717 */                       return arrayList;
                            } catch (Throwable th2) {
/* 721 */                       throw th2;
                            }
                    }
                }
            }
