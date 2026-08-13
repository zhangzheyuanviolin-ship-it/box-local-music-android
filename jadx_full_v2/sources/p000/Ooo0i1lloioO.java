            package p000;

            import androidx.work.impl.model.WorkSpec;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class Ooo0i1lloioO implements Function1 {
                public final int I00iOIl;

                public Ooo0i1lloioO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                private final Object I00000oIO(Object obj) throws Exception {
                    int i;
                    int i2;
                    Integer numValueOf;
/* 7 */             OiIIl0O1l0l oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE state=1");
                    try {
/* 13 */                int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 19 */                int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 25 */                int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 31 */                int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 37 */                int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 43 */                int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 49 */                int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 55 */                int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 61 */                int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 67 */                int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 73 */                int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 79 */                int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 85 */                int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 91 */                int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 97 */                int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 105 */               int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 113 */               int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 121 */               int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 129 */               int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 137 */               int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 145 */               int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 153 */               int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 161 */               int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 169 */               int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 177 */               int iI00000oIO25 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 185 */               int iI00000oIO26 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 193 */               int iI00000oIO27 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 201 */               int iI00000oIO28 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 209 */               int iI00000oIO29 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 217 */               int iI00000oIO30 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 225 */               int iI00000oIO31 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 233 */               int iI00000oIO32 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 241 */               int iI00000oIO33 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 249 */               ArrayList arrayList = new ArrayList();
/* 256 */               while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 258 */                   String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO);
/* 262 */                   int i3 = iI00000oIO14;
/* 264 */                   ArrayList arrayList2 = arrayList;
/* 271 */                   i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO2));
/* 275 */                   String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3);
/* 279 */                   String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4);
/* 283 */                   byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO5);
/* 287 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 289 */                   Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 297 */                   Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO6));
/* 301 */                   long j = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7);
/* 305 */                   long j2 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO8);
/* 309 */                   long j3 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO9);
/* 317 */                   int i4 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO10);
/* 318 */                   int i5 = iI00000oIO2;
/* 319 */                   int i6 = iI00000oIO3;
/* 326 */                   I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO11));
/* 330 */                   long j4 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO12);
/* 334 */                   long j5 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO13);
/* 340 */                   long j6 = oiIIl0O1l0lI00000oIO.getLong(i3);
/* 344 */                   int i7 = iI00000oIO15;
/* 346 */                   long j7 = oiIIl0O1l0lI00000oIO.getLong(i7);
/* 350 */                   int i8 = iI00000oIO;
/* 354 */                   int i9 = iI00000oIO16;
/* 374 */                   boolean z = ((int) oiIIl0O1l0lI00000oIO.getLong(i9)) != 0;
/* 369 */                   int i10 = iI00000oIO17;
/* 371 */                   int i11 = iI00000oIO4;
/* 382 */                   OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i10));
/* 386 */                   int i12 = iI00000oIO18;
/* 388 */                   int i13 = iI00000oIO5;
/* 394 */                   int i14 = (int) oiIIl0O1l0lI00000oIO.getLong(i12);
/* 397 */                   int i15 = iI00000oIO19;
/* 405 */                   int i16 = (int) oiIIl0O1l0lI00000oIO.getLong(i15);
/* 406 */                   int i17 = iI00000oIO20;
/* 408 */                   long j8 = oiIIl0O1l0lI00000oIO.getLong(i17);
/* 416 */                   int i18 = iI00000oIO21;
/* 424 */                   int i19 = (int) oiIIl0O1l0lI00000oIO.getLong(i18);
/* 427 */                   int i20 = iI00000oIO22;
/* 435 */                   int i21 = (int) oiIIl0O1l0lI00000oIO.getLong(i20);
/* 436 */                   int i22 = iI00000oIO23;
/* 442 */                   Boolean boolValueOf = null;
/* 453 */                   String strI00i0O4 = oiIIl0O1l0lI00000oIO.isNull(i22) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i22);
/* 450 */                   int i23 = iI00000oIO24;
/* 464 */                   if (oiIIl0O1l0lI00000oIO.isNull(i23)) {
/* 466 */                       i = i19;
/* 468 */                       i2 = i20;
/* 470 */                       numValueOf = null;
                            } else {
/* 473 */                       i = i19;
/* 475 */                       i2 = i20;
/* 482 */                       numValueOf = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i23));
                            }
/* 486 */                   if (numValueOf != null) {
/* 498 */                       boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            }
/* 504 */                   int i24 = iI00000oIO25;
/* 506 */                   Boolean bool = boolValueOf;
/* 517 */                   OIIOlI oIIOlII0000oI00 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i24));
/* 521 */                   int i25 = iI00000oIO26;
/* 527 */                   OIIOOo oIIOOoI000l1 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i25));
/* 531 */                   iI00000oIO25 = i24;
/* 533 */                   iI00000oIO26 = i25;
/* 535 */                   int i26 = iI00000oIO27;
/* 551 */                   boolean z2 = ((int) oiIIl0O1l0lI00000oIO.getLong(i26)) != 0;
/* 546 */                   iI00000oIO27 = i26;
/* 548 */                   int i27 = iI00000oIO28;
/* 568 */                   boolean z3 = ((int) oiIIl0O1l0lI00000oIO.getLong(i27)) != 0;
/* 565 */                   int i28 = iI00000oIO29;
/* 586 */                   boolean z4 = ((int) oiIIl0O1l0lI00000oIO.getLong(i28)) != 0;
/* 581 */                   iI00000oIO29 = i28;
/* 583 */                   int i29 = iI00000oIO30;
/* 598 */                   int i30 = iI00000oIO31;
/* 608 */                   int i31 = iI00000oIO32;
/* 616 */                   int i32 = iI00000oIO33;
/* 644 */                   iI00000oIO33 = i32;
/* 648 */                   arrayList2.add(new WorkSpec(strI00i0O, i01ioio1loI000II, strI00i0O2, strI00i0O3, ii11I1OOII1I00000oIO, ii11I1OOII1I00000oIO2, j, j2, j3, new IOo0o10i1IO(oIIOOoI000l1, oIIOlII0000oI00, z2, z3, z4, ((int) oiIIl0O1l0lI00000oIO.getLong(i29)) != 0, oiIIl0O1l0lI00000oIO.getLong(i30), oiIIl0O1l0lI00000oIO.getLong(i31), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i32))), i4, i1o1O1Ii1l0lI0000O, j4, j5, j6, j7, z, oIio0Ii1IiI0001Ioi1lo, i14, i16, j8, i, i21, strI00i0O4, bool));
/* 653 */                   iI00000oIO30 = i29;
/* 655 */                   iI00000oIO4 = i11;
/* 657 */                   iI00000oIO17 = i10;
/* 659 */                   iI00000oIO19 = i15;
/* 661 */                   iI00000oIO22 = i2;
/* 663 */                   iI00000oIO24 = i23;
/* 665 */                   iI00000oIO31 = i30;
/* 667 */                   iI00000oIO32 = i31;
/* 669 */                   iI00000oIO2 = i5;
/* 670 */                   iI00000oIO14 = i3;
/* 672 */                   iI00000oIO3 = i6;
/* 674 */                   arrayList = arrayList2;
/* 675 */                   iI00000oIO = i8;
/* 677 */                   iI00000oIO15 = i7;
/* 679 */                   iI00000oIO16 = i9;
/* 681 */                   iI00000oIO20 = i17;
/* 683 */                   iI00000oIO21 = i18;
/* 685 */                   iI00000oIO23 = i22;
/* 687 */                   iI00000oIO28 = i27;
/* 689 */                   iI00000oIO5 = i13;
/* 691 */                   iI00000oIO18 = i12;
                        }
/* 695 */               ArrayList arrayList3 = arrayList;
/* 696 */               oiIIl0O1l0lI00000oIO.close();
/* 699 */               return arrayList3;
                    } catch (Throwable th) {
/* 700 */               oiIIl0O1l0lI00000oIO.close();
/* 1261 */              throw th;
                    }
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
                    boolean z;
                    int i;
                    int i2;
                    Integer numValueOf;
                    Boolean boolValueOf;
                    Integer numValueOf2;
                    Boolean boolValueOf2;
                    switch (this.I00iOIl) {
                        case 0:
/* 1999 */                  I110ilOOl0io i110ilOOl0io = (I110ilOOl0io) obj;
/* 2022 */                  Iil1I1il0I1 iil1I1il0I1 = new Iil1I1il0I1();
/* 2025 */                  iil1I1il0I1.I00000oIO = (Float.floatToRawIntBits(i110ilOOl0io.I00000oIO) << 32) | (Float.floatToRawIntBits(i110ilOOl0io.I00000oOI) & 4294967295L);
/* 2027 */                  VarHandle.storeStoreFence();
/* 2030 */                  return iil1I1il0I1;
                        case 1:
/* 1971 */                  Ol0i1I ol0i1I = (Ol0i1I) obj;
/* 1993 */                  return new I110ilOOl0io(Float.intBitsToFloat((int) (ol0i1I.I00000oIO >> 32)), Float.intBitsToFloat((int) (ol0i1I.I00000oIO & 4294967295L)));
                        case 2:
/* 1943 */                  I110ilOOl0io i110ilOOl0io2 = (I110ilOOl0io) obj;
/* 1964 */                  return Ol0i1I.I00000oIO((Float.floatToRawIntBits(i110ilOOl0io2.I00000oIO) << 32) | (Float.floatToRawIntBits(i110ilOOl0io2.I00000oOI) & 4294967295L));
                        case 3:
/* 1915 */                  OIOlIiiioi oIOlIiiioi = (OIOlIiiioi) obj;
/* 1937 */                  return new I110ilOOl0io(Float.intBitsToFloat((int) (oIOlIiiioi.I00000oIO >> 32)), Float.intBitsToFloat((int) (oIOlIiiioi.I00000oIO & 4294967295L)));
                        case 4:
/* 1887 */                  I110ilOOl0io i110ilOOl0io3 = (I110ilOOl0io) obj;
/* 1908 */                  return OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(i110ilOOl0io3.I00000oIO) << 32) | (Float.floatToRawIntBits(i110ilOOl0io3.I00000oOI) & 4294967295L));
                        case 5:
/* 1871 */                  long j = ((IooO0O) obj).I00000oIO;
/* 1881 */                  return new I110ilOOl0io((int) (j >> 32), (int) (j & 4294967295L));
                        case 6:
/* 1838 */                  I110ilOOl0io i110ilOOl0io4 = (I110ilOOl0io) obj;
/* 1860 */                  return IooO0O.I00000oIO((Math.round(i110ilOOl0io4.I00000oIO) << 32) | (Math.round(i110ilOOl0io4.I00000oOI) & 4294967295L));
                        case 7:
/* 1822 */                  long j2 = ((IooOl0ol01) obj).I00000oIO;
/* 1832 */                  return new I110ilOOl0io((int) (j2 >> 32), (int) (j2 & 4294967295L));
                        case 8:
/* 1782 */                  I110ilOOl0io i110ilOOl0io5 = (I110ilOOl0io) obj;
/* 1786 */                  int iRound = Math.round(i110ilOOl0io5.I00000oIO);
/* 1790 */                  if (iRound < 0) {
/* 1792 */                      iRound = 0;
                            }
/* 1811 */                  return IooOl0ol01.I00000oIO((iRound << 32) | ((Math.round(i110ilOOl0io5.I00000oOI) < 0 ? 0 : r0) & 4294967295L));
                        case 9:
/* 1763 */                  OOo0IO oOo0IO = (OOo0IO) obj;
/* 1775 */                  return new I110o0lol(oOo0IO.I00000oIO, oOo0IO.I00000oOI, oOo0IO.I0000Il00O, oOo0IO.I0000O);
                        case 10:
/* 1745 */                  I110o0lol i110o0lol = (I110o0lol) obj;
/* 1757 */                  return new OOo0IO(i110o0lol.I00000oIO, i110o0lol.I00000oOI, i110o0lol.I0000Il00O, i110o0lol.I0000O);
                        case 11:
/* 1738 */                  return Float.valueOf(((I110iOiOllO) obj).I00000oIO);
                        case 12:
/* 1704 */                  float fFloatValue = ((Float) obj).floatValue();
/* 1727 */                  return Float.valueOf((fFloatValue <= 0.1f || fFloatValue >= 0.95f) ? 0.0f : 1.0f);
                        case 13:
/* 1697 */                  return ((i00lIlOOll0) obj).I0000Il00O;
                        case 14:
/* 1690 */                  return ((i00lIlOOll0) obj).I0000oI00;
                        case 15:
/* 1683 */                  return (i00oiO1iiI1) obj;
                        case 16:
/* 1663 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM WorkProgress");
                            try {
/* 1667 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1670 */                      oiIIl0O1l0lI00000oIO.close();
/* 1673 */                      return OoiIlOl1iI.I00000oIO;
                            } finally {
                            }
                        case 17:
/* 1623 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                            try {
/* 1629 */                      ArrayList arrayList = new ArrayList();
/* 1636 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1643 */                          arrayList.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 1652 */                      return arrayList;
                            } finally {
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 1585 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                            try {
/* 1604 */                      int i3 = oiIIl0O1l0lI00000oIO.I00ol1() ? (int) oiIIl0O1l0lI00000oIO.getLong(0) : 0;
/* 1605 */                      oiIIl0O1l0lI00000oIO.close();
/* 1608 */                      return Integer.valueOf(i3);
                            } finally {
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 1561 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                            try {
/* 1565 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1568 */                      oiIIl0O1l0lI00000oIO.close();
/* 1571 */                      return OoiIlOl1iI.I00000oIO;
                            } finally {
                            }
                        case PoseLandmark.RIGHT_INDEX:
/* 1516 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                            try {
/* 1524 */                      if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1532 */                          z = ((int) oiIIl0O1l0lI00000oIO.getLong(0)) != 0;
                                } else {
/* 1542 */                          z = false;
                                }
/* 1543 */                      oiIIl0O1l0lI00000oIO.close();
/* 1546 */                      return Boolean.valueOf(z);
                            } finally {
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 1482 */                  Olil0III olil0III = (Olil0III) obj;
/* 1486 */                  oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                            try {
/* 1490 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1493 */                      int iI00000oIO = lO01iO1I1lOi.I00000oIO(olil0III);
/* 1497 */                      oiIIl0O1l0lI00000oIO.close();
/* 1500 */                      return Integer.valueOf(iI00000oIO);
                            } finally {
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 813 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                            try {
/* 817 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 821 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 825 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 829 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 833 */                       int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 837 */                       int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 841 */                       int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 845 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 849 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 853 */                       int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 857 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 861 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 865 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 869 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 875 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 883 */                       int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 891 */                       int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 899 */                       int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 907 */                       int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 915 */                       int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 923 */                       int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 931 */                       int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 939 */                       int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 947 */                       int iI00000oIO25 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 955 */                       int iI00000oIO26 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 963 */                       int iI00000oIO27 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 971 */                       int iI00000oIO28 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 979 */                       int iI00000oIO29 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 987 */                       int iI00000oIO30 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 995 */                       int iI00000oIO31 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 1003 */                      int iI00000oIO32 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 1011 */                      int iI00000oIO33 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 1019 */                      int iI00000oIO34 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 1027 */                      ArrayList arrayList2 = new ArrayList();
/* 1034 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1036 */                          String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2);
/* 1040 */                          int i4 = iI00000oIO15;
/* 1042 */                          int i5 = iI00000oIO14;
/* 1049 */                          i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO3));
/* 1053 */                          String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4);
/* 1057 */                          String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO5);
/* 1061 */                          byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO6);
/* 1065 */                          Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1067 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 1075 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO7));
/* 1079 */                          long j3 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO8);
/* 1083 */                          long j4 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO9);
/* 1087 */                          long j5 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO10);
/* 1095 */                          int i6 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO11);
/* 1096 */                          int i7 = iI00000oIO4;
/* 1098 */                          int i8 = iI00000oIO3;
/* 1104 */                          I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO12));
/* 1108 */                          long j6 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO13);
/* 1114 */                          long j7 = oiIIl0O1l0lI00000oIO.getLong(i5);
/* 1120 */                          long j8 = oiIIl0O1l0lI00000oIO.getLong(i4);
/* 1126 */                          int i9 = iI00000oIO16;
/* 1128 */                          long j9 = oiIIl0O1l0lI00000oIO.getLong(i9);
/* 1132 */                          iI00000oIO16 = i9;
/* 1136 */                          int i10 = iI00000oIO17;
/* 1138 */                          int i11 = iI00000oIO2;
/* 1155 */                          boolean z2 = ((int) oiIIl0O1l0lI00000oIO.getLong(i10)) != 0;
/* 1149 */                          int i12 = iI00000oIO5;
/* 1152 */                          int i13 = iI00000oIO18;
/* 1163 */                          OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i13));
/* 1168 */                          iI00000oIO18 = i13;
/* 1170 */                          int i14 = iI00000oIO19;
/* 1176 */                          int i15 = (int) oiIIl0O1l0lI00000oIO.getLong(i14);
/* 1177 */                          iI00000oIO19 = i14;
/* 1179 */                          int i16 = iI00000oIO20;
/* 1187 */                          int i17 = (int) oiIIl0O1l0lI00000oIO.getLong(i16);
/* 1188 */                          int i18 = iI00000oIO21;
/* 1190 */                          long j10 = oiIIl0O1l0lI00000oIO.getLong(i18);
/* 1198 */                          int i19 = iI00000oIO22;
/* 1206 */                          int i20 = (int) oiIIl0O1l0lI00000oIO.getLong(i19);
/* 1209 */                          int i21 = iI00000oIO23;
/* 1217 */                          int i22 = (int) oiIIl0O1l0lI00000oIO.getLong(i21);
/* 1218 */                          int i23 = iI00000oIO24;
/* 1233 */                          String strI00i0O4 = oiIIl0O1l0lI00000oIO.isNull(i23) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i23);
/* 1230 */                          int i24 = iI00000oIO25;
/* 1244 */                          if (oiIIl0O1l0lI00000oIO.isNull(i24)) {
/* 1246 */                              i = i23;
/* 1248 */                              i2 = i21;
/* 1250 */                              numValueOf = null;
                                    } else {
/* 1253 */                              i = i23;
/* 1255 */                              i2 = i21;
/* 1262 */                              numValueOf = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i24));
                                    }
/* 1266 */                          if (numValueOf != null) {
/* 1278 */                              boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    } else {
/* 1293 */                              boolValueOf = null;
                                    }
/* 1287 */                          int i25 = iI00000oIO26;
/* 1301 */                          OIIOlI oIIOlII0000oI00 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i25));
/* 1305 */                          int i26 = iI00000oIO27;
/* 1311 */                          OIIOOo oIIOOoI000l1 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i26));
/* 1319 */                          int i27 = iI00000oIO28;
/* 1335 */                          boolean z3 = ((int) oiIIl0O1l0lI00000oIO.getLong(i27)) != 0;
/* 1332 */                          int i28 = iI00000oIO29;
/* 1353 */                          boolean z4 = ((int) oiIIl0O1l0lI00000oIO.getLong(i28)) != 0;
/* 1350 */                          int i29 = iI00000oIO30;
/* 1371 */                          boolean z5 = ((int) oiIIl0O1l0lI00000oIO.getLong(i29)) != 0;
/* 1366 */                          iI00000oIO30 = i29;
/* 1368 */                          int i30 = iI00000oIO31;
/* 1383 */                          int i31 = iI00000oIO32;
/* 1393 */                          int i32 = iI00000oIO33;
/* 1399 */                          iI00000oIO32 = i31;
/* 1401 */                          int i33 = iI00000oIO34;
/* 1425 */                          iI00000oIO34 = i33;
/* 1429 */                          arrayList2.add(new WorkSpec(strI00i0O, i01ioio1loI000II, strI00i0O2, strI00i0O3, ii11I1OOII1I00000oIO, ii11I1OOII1I00000oIO2, j3, j4, j5, new IOo0o10i1IO(oIIOOoI000l1, oIIOlII0000oI00, z3, z4, z5, ((int) oiIIl0O1l0lI00000oIO.getLong(i30)) != 0, oiIIl0O1l0lI00000oIO.getLong(i31), oiIIl0O1l0lI00000oIO.getLong(i32), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i33))), i6, i1o1O1Ii1l0lI0000O, j6, j7, j8, j9, z2, oIio0Ii1IiI0001Ioi1lo, i15, i17, j10, i20, i22, strI00i0O4, boolValueOf));
/* 1433 */                          iI00000oIO2 = i11;
/* 1435 */                          iI00000oIO17 = i10;
/* 1437 */                          iI00000oIO20 = i16;
/* 1439 */                          iI00000oIO22 = i19;
/* 1441 */                          iI00000oIO23 = i2;
/* 1443 */                          iI00000oIO24 = i;
/* 1445 */                          iI00000oIO25 = i24;
/* 1447 */                          iI00000oIO26 = i25;
/* 1449 */                          iI00000oIO27 = i26;
/* 1451 */                          iI00000oIO33 = i32;
/* 1453 */                          iI00000oIO31 = i30;
/* 1455 */                          iI00000oIO3 = i8;
/* 1456 */                          iI00000oIO5 = i12;
/* 1458 */                          iI00000oIO21 = i18;
/* 1460 */                          iI00000oIO28 = i27;
/* 1462 */                          iI00000oIO14 = i5;
/* 1464 */                          iI00000oIO4 = i7;
/* 1466 */                          iI00000oIO29 = i28;
/* 1468 */                          iI00000oIO15 = i4;
                                }
/* 1475 */                      return arrayList2;
                            } finally {
                            }
                        case PoseLandmark.LEFT_HIP:
/* 771 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id FROM workspec");
                            try {
/* 777 */                       ArrayList arrayList3 = new ArrayList();
/* 784 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 791 */                           arrayList3.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 800 */                       return arrayList3;
                            } finally {
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 731 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id FROM workspec");
                            try {
/* 737 */                       ArrayList arrayList4 = new ArrayList();
/* 744 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 751 */                           arrayList4.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 760 */                       return arrayList4;
                            } finally {
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 720 */                   return I00000oIO(obj);
                        default:
/* 67 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                            try {
/* 71 */                        int iI00000oIO35 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 75 */                        int iI00000oIO36 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 79 */                        int iI00000oIO37 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 83 */                        int iI00000oIO38 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 87 */                        int iI00000oIO39 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 91 */                        int iI00000oIO40 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 95 */                        int iI00000oIO41 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 99 */                        int iI00000oIO42 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 103 */                       int iI00000oIO43 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 107 */                       int iI00000oIO44 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 111 */                       int iI00000oIO45 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 115 */                       int iI00000oIO46 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 119 */                       int iI00000oIO47 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 123 */                       int iI00000oIO48 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 129 */                       int iI00000oIO49 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 137 */                       int iI00000oIO50 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 145 */                       int iI00000oIO51 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 153 */                       int iI00000oIO52 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 161 */                       int iI00000oIO53 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 169 */                       int iI00000oIO54 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 177 */                       int iI00000oIO55 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 185 */                       int iI00000oIO56 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 193 */                       int iI00000oIO57 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 201 */                       int iI00000oIO58 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 209 */                       int iI00000oIO59 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 217 */                       int iI00000oIO60 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 225 */                       int iI00000oIO61 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 233 */                       int iI00000oIO62 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 241 */                       int iI00000oIO63 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 249 */                       int iI00000oIO64 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 257 */                       int iI00000oIO65 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 265 */                       int iI00000oIO66 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 273 */                       int iI00000oIO67 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 281 */                       ArrayList arrayList5 = new ArrayList();
/* 288 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 290 */                           String strI00i0O5 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO35);
/* 294 */                           int i34 = iI00000oIO48;
/* 296 */                           int i35 = iI00000oIO47;
/* 303 */                           i01IOiO1lO i01ioio1loI000II2 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO36));
/* 307 */                           String strI00i0O6 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO37);
/* 311 */                           String strI00i0O7 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO38);
/* 315 */                           byte[] blob2 = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO39);
/* 319 */                           Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 321 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO3 = il01ool0o.I00000oIO(blob2);
/* 329 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO4 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO40));
/* 333 */                           long j11 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO41);
/* 337 */                           long j12 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO42);
/* 341 */                           long j13 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO43);
/* 349 */                           int i36 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO44);
/* 350 */                           int i37 = iI00000oIO37;
/* 352 */                           int i38 = iI00000oIO36;
/* 359 */                           I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O2 = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO45));
/* 363 */                           long j14 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO46);
/* 369 */                           long j15 = oiIIl0O1l0lI00000oIO.getLong(i35);
/* 375 */                           long j16 = oiIIl0O1l0lI00000oIO.getLong(i34);
/* 379 */                           int i39 = iI00000oIO49;
/* 381 */                           long j17 = oiIIl0O1l0lI00000oIO.getLong(i39);
/* 389 */                           int i40 = iI00000oIO35;
/* 391 */                           int i41 = iI00000oIO50;
/* 409 */                           boolean z6 = ((int) oiIIl0O1l0lI00000oIO.getLong(i41)) != 0;
/* 402 */                           int i42 = iI00000oIO38;
/* 406 */                           int i43 = iI00000oIO51;
/* 417 */                           OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo2 = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i43));
/* 421 */                           int i44 = iI00000oIO52;
/* 427 */                           int i45 = (int) oiIIl0O1l0lI00000oIO.getLong(i44);
/* 432 */                           int i46 = iI00000oIO53;
/* 438 */                           int i47 = (int) oiIIl0O1l0lI00000oIO.getLong(i46);
/* 441 */                           long j18 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO54);
/* 449 */                           int i48 = iI00000oIO55;
/* 455 */                           int i49 = (int) oiIIl0O1l0lI00000oIO.getLong(i48);
/* 456 */                           iI00000oIO55 = i48;
/* 460 */                           int i50 = iI00000oIO56;
/* 466 */                           int i51 = (int) oiIIl0O1l0lI00000oIO.getLong(i50);
/* 467 */                           int i52 = iI00000oIO57;
/* 482 */                           String strI00i0O8 = oiIIl0O1l0lI00000oIO.isNull(i52) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i52);
/* 479 */                           int i53 = iI00000oIO58;
/* 493 */                           if (oiIIl0O1l0lI00000oIO.isNull(i53)) {
/* 495 */                               iI00000oIO57 = i52;
/* 497 */                               iI00000oIO56 = i50;
/* 499 */                               numValueOf2 = null;
                                    } else {
/* 502 */                               iI00000oIO57 = i52;
/* 504 */                               iI00000oIO56 = i50;
/* 511 */                               numValueOf2 = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i53));
                                    }
/* 515 */                           if (numValueOf2 != null) {
/* 527 */                               boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                                    } else {
/* 542 */                               boolValueOf2 = null;
                                    }
/* 536 */                           int i54 = iI00000oIO59;
/* 550 */                           OIIOlI oIIOlII0000oI002 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i54));
/* 554 */                           int i55 = iI00000oIO60;
/* 560 */                           OIIOOo oIIOOoI000l12 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i55));
/* 564 */                           iI00000oIO58 = i53;
/* 566 */                           iI00000oIO59 = i54;
/* 568 */                           int i56 = iI00000oIO61;
/* 584 */                           boolean z7 = ((int) oiIIl0O1l0lI00000oIO.getLong(i56)) != 0;
/* 581 */                           int i57 = iI00000oIO62;
/* 602 */                           boolean z8 = ((int) oiIIl0O1l0lI00000oIO.getLong(i57)) != 0;
/* 597 */                           iI00000oIO61 = i56;
/* 599 */                           int i58 = iI00000oIO63;
/* 621 */                           boolean z9 = ((int) oiIIl0O1l0lI00000oIO.getLong(i58)) != 0;
/* 614 */                           iI00000oIO62 = i57;
/* 616 */                           iI00000oIO63 = i58;
/* 618 */                           int i59 = iI00000oIO64;
/* 633 */                           int i60 = iI00000oIO65;
/* 643 */                           int i61 = iI00000oIO66;
/* 649 */                           int i62 = iI00000oIO67;
/* 673 */                           iI00000oIO65 = i60;
/* 677 */                           arrayList5.add(new WorkSpec(strI00i0O5, i01ioio1loI000II2, strI00i0O6, strI00i0O7, ii11I1OOII1I00000oIO3, ii11I1OOII1I00000oIO4, j11, j12, j13, new IOo0o10i1IO(oIIOOoI000l12, oIIOlII0000oI002, z7, z8, z9, ((int) oiIIl0O1l0lI00000oIO.getLong(i59)) != 0, oiIIl0O1l0lI00000oIO.getLong(i60), oiIIl0O1l0lI00000oIO.getLong(i61), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i62))), i36, i1o1O1Ii1l0lI0000O2, j14, j15, j16, j17, z6, oIio0Ii1IiI0001Ioi1lo2, i45, i47, j18, i49, i51, strI00i0O8, boolValueOf2));
/* 680 */                           iI00000oIO66 = i61;
/* 682 */                           iI00000oIO64 = i59;
/* 684 */                           iI00000oIO67 = i62;
/* 686 */                           iI00000oIO48 = i34;
/* 688 */                           iI00000oIO36 = i38;
/* 690 */                           iI00000oIO37 = i37;
/* 692 */                           iI00000oIO38 = i42;
/* 694 */                           iI00000oIO50 = i41;
/* 696 */                           iI00000oIO51 = i43;
/* 698 */                           iI00000oIO52 = i44;
/* 700 */                           iI00000oIO53 = i46;
/* 702 */                           iI00000oIO60 = i55;
/* 704 */                           iI00000oIO35 = i40;
/* 706 */                           iI00000oIO49 = i39;
/* 708 */                           iI00000oIO47 = i35;
                                }
/* 715 */                       return arrayList5;
                            } finally {
                            }
                    }
                }
            }
