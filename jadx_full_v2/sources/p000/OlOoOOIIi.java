            package p000;

            import androidx.work.impl.model.WorkSpec;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class OlOoOOIIi implements Function1 {
                public final int I00iOIl;
                public String I00iiI;

                public OlOoOOIIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:225:0x050b  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
                    Ii11I1OOII1 ii11I1OOII1I00000oIO;
                    WorkSpec workSpec;
                    Boolean boolValueOf;
                    i01IOiO1lO i01ioio1loI000II;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1497 */                  String str = this.I00iiI;
/* 1501 */                  String str2 = (String) obj;
                            return OlOoOIi0o.I001l0I00(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
                        case 1:
/* 1469 */                  String str3 = this.I00iiI;
/* 1477 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM SystemIdInfo where work_spec_id=?");
                            try {
/* 1482 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str3);
/* 1485 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1491 */                      return ooiIlOl1iI;
                            } finally {
                            }
                        case 2:
/* 1465 */                  Oil0Io.I0000O((Oil0O0I) obj, this.I00iiI);
/* 1468 */                  return ooiIlOl1iI;
                        case 3:
/* 1445 */                  String str4 = this.I00iiI;
/* 1451 */                  O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 1455 */                  ((Oil0O0I) obj).I00000oOI(Oil0I1O.I00IoiI, str4);
/* 1458 */                  return ooiIlOl1iI;
                        case 4:
/* 1431 */                  String str5 = this.I00iiI;
/* 1435 */                  Oil0O0I oil0O0I = (Oil0O0I) obj;
/* 1438 */                  Oil0Io.I000II(oil0O0I, 1);
/* 1441 */                  Oil0Io.I000O01llI0(oil0O0I, str5);
/* 1444 */                  return ooiIlOl1iI;
                        case 5:
/* 1426 */                  return OoIIliIIII0.I00000oIO((OoIIliIIII0) obj, null, this.I00iiI, 63);
                        case 6:
/* 1412 */                  return OoIIliIIII0.I00000oIO((OoIIliIIII0) obj, this.I00iiI, null, 159);
                        case 7:
/* 1357 */                  String str6 = this.I00iiI;
/* 1365 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT work_spec_id FROM workname WHERE name=?");
                            try {
/* 1370 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str6);
/* 1375 */                      ArrayList arrayList = new ArrayList();
/* 1382 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1389 */                          arrayList.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 1398 */                      return arrayList;
                            } finally {
                            }
                        case 8:
/* 1311 */                  String str7 = this.I00iiI;
/* 1319 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT name FROM workname WHERE work_spec_id=?");
                            try {
/* 1324 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str7);
/* 1329 */                      ArrayList arrayList2 = new ArrayList();
/* 1336 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1343 */                          arrayList2.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 1352 */                      return arrayList2;
                            } finally {
                            }
                        case 9:
/* 1255 */                  String str8 = this.I00iiI;
/* 1263 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT progress FROM WorkProgress WHERE work_spec_id=?");
                            try {
/* 1268 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str8);
/* 1275 */                      if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1286 */                          byte[] blob = oiIIl0O1l0lI00000oIO.isNull(0) ? null : oiIIl0O1l0lI00000oIO.getBlob(0);
/* 1290 */                          if (blob != null) {
/* 1294 */                              Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1296 */                              ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
                                    }
                                } else {
/* 1292 */                          ii11I1OOII1I00000oIO = null;
                                }
/* 1306 */                      return ii11I1OOII1I00000oIO;
                            } finally {
                            }
                        case 10:
/* 1227 */                  String str9 = this.I00iiI;
/* 1235 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE from WorkProgress where work_spec_id=?");
                            try {
/* 1240 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str9);
/* 1243 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1249 */                      return ooiIlOl1iI;
                            } finally {
                            }
                        case 11:
/* 1199 */                  String str10 = this.I00iiI;
/* 1207 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM workspec WHERE id=?");
                            try {
/* 1212 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str10);
/* 1215 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1221 */                      return ooiIlOl1iI;
                            } finally {
                            }
                        case 12:
/* 1134 */                  String str11 = this.I00iiI;
/* 1142 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                            try {
/* 1147 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str11);
/* 1152 */                      ArrayList arrayList3 = new ArrayList();
/* 1159 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1162 */                          String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 1172 */                          i01IOiO1lO i01ioio1loI000II2 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(1));
/* 1178 */                          i01Oil0 i01oil0 = new i01Oil0();
/* 1181 */                          i01oil0.I00000oIO = strI00i0O;
/* 1183 */                          i01oil0.I00000oOI = i01ioio1loI000II2;
/* 1185 */                          arrayList3.add(i01oil0);
                                }
/* 1194 */                      return arrayList3;
                            } finally {
                            }
                        case 13:
/* 1088 */                  String str12 = this.I00iiI;
/* 1096 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                            try {
/* 1101 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str12);
/* 1106 */                      ArrayList arrayList4 = new ArrayList();
/* 1113 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1120 */                          arrayList4.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 1129 */                      return arrayList4;
                            } finally {
                            }
                        case 14:
/* 1052 */                  String str13 = this.I00iiI;
/* 1056 */                  Olil0III olil0III = (Olil0III) obj;
/* 1060 */                  oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                            try {
/* 1065 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str13);
/* 1068 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1071 */                      int iI00000oIO = lO01iO1I1lOi.I00000oIO(olil0III);
/* 1075 */                      oiIIl0O1l0lI00000oIO.close();
/* 1078 */                      return Integer.valueOf(iI00000oIO);
                            } finally {
                            }
                        case 15:
/* 1024 */                  String str14 = this.I00iiI;
/* 1032 */                  oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                            try {
/* 1037 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str14);
/* 1040 */                      oiIIl0O1l0lI00000oIO.I00ol1();
/* 1046 */                      return ooiIlOl1iI;
                            } finally {
                            }
                        case 16:
/* 427 */                   String str15 = this.I00iiI;
/* 435 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE id=?");
                            try {
/* 439 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str15);
/* 444 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 450 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 456 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 462 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 468 */                       int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 474 */                       int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 480 */                       int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 486 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 492 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 498 */                       int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 504 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 510 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 516 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 522 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 528 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 536 */                       int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 544 */                       int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 552 */                       int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 560 */                       int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 568 */                       int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 576 */                       int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 584 */                       int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 592 */                       int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 600 */                       int iI00000oIO25 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 608 */                       int iI00000oIO26 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 616 */                       int iI00000oIO27 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 624 */                       int iI00000oIO28 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 632 */                       int iI00000oIO29 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 640 */                       int iI00000oIO30 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 648 */                       int iI00000oIO31 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 656 */                       int iI00000oIO32 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 664 */                       int iI00000oIO33 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 672 */                       int iI00000oIO34 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 680 */                       if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 682 */                           String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO2);
/* 692 */                           i01IOiO1lO i01ioio1loI000II3 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO3));
/* 696 */                           String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4);
/* 700 */                           String strI00i0O4 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO5);
/* 704 */                           byte[] blob2 = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO6);
/* 708 */                           Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 710 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(blob2);
/* 718 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO3 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO7));
/* 722 */                           long j = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO8);
/* 726 */                           long j2 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO9);
/* 730 */                           long j3 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO10);
/* 738 */                           int i2 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO11);
/* 744 */                           I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO12));
/* 748 */                           long j4 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO13);
/* 752 */                           long j5 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO14);
/* 756 */                           long j6 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO15);
/* 762 */                           long j7 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO16);
/* 780 */                           boolean z = ((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO17)) != 0;
/* 788 */                           OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO18));
/* 798 */                           int i3 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO19);
/* 805 */                           int i4 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO20);
/* 808 */                           long j8 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO21);
/* 818 */                           int i5 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO22);
/* 825 */                           int i6 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO23);
/* 839 */                           String strI00i0O5 = oiIIl0O1l0lI00000oIO.isNull(iI00000oIO24) ? null : oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO24);
/* 859 */                           Integer numValueOf = oiIIl0O1l0lI00000oIO.isNull(iI00000oIO25) ? null : Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO25));
/* 863 */                           if (numValueOf != null) {
/* 874 */                               boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    } else {
/* 886 */                               boolValueOf = null;
                                    }
/* 1009 */                          workSpec = new WorkSpec(strI00i0O2, i01ioio1loI000II3, strI00i0O3, strI00i0O4, ii11I1OOII1I00000oIO2, ii11I1OOII1I00000oIO3, j, j2, j3, new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO27)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO26)), ((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO28)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO29)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO30)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO31)) != 0, oiIIl0O1l0lI00000oIO.getLong(iI00000oIO32), oiIIl0O1l0lI00000oIO.getLong(iI00000oIO33), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO34))), i2, i1o1O1Ii1l0lI0000O, j4, j5, j6, j7, z, oIio0Ii1IiI0001Ioi1lo, i3, i4, j8, i5, i6, strI00i0O5, boolValueOf);
                                } else {
/* 1015 */                          workSpec = null;
                                }
/* 1019 */                      return workSpec;
                            } finally {
                            }
                        case 17:
/* 377 */                   String str16 = this.I00iiI;
/* 385 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                            try {
/* 389 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str16);
/* 394 */                       ArrayList arrayList5 = new ArrayList();
/* 401 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 403 */                           byte[] blob3 = oiIIl0O1l0lI00000oIO.getBlob(0);
/* 407 */                           Ii11I1OOII1 ii11I1OOII13 = Ii11I1OOII1.I00000oOI;
/* 413 */                           arrayList5.add(il01ool0o.I00000oIO(blob3));
                                }
/* 422 */                       return arrayList5;
                            } finally {
                            }
                        case PoseLandmark.RIGHT_PINKY:
/* 350 */                   String str17 = this.I00iiI;
/* 358 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("UPDATE workspec SET generation=generation+1 WHERE id=?");
                            try {
/* 362 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str17);
/* 365 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 371 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 315 */                   String str18 = this.I00iiI;
/* 319 */                   Olil0III olil0III2 = (Olil0III) obj;
/* 323 */                   oiIIl0O1l0lI00000oIO = olil0III2.I00000oIO("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                            try {
/* 327 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str18);
/* 330 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 333 */                       int iI00000oIO35 = lO01iO1I1lOi.I00000oIO(olil0III2);
/* 337 */                       oiIIl0O1l0lI00000oIO.close();
/* 340 */                       return Integer.valueOf(iI00000oIO35);
                            } finally {
                            }
                        case PoseLandmark.RIGHT_INDEX:
/* 271 */                   String str19 = this.I00iiI;
/* 279 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                            try {
/* 283 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str19);
/* 288 */                       ArrayList arrayList6 = new ArrayList();
/* 295 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 301 */                           arrayList6.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 310 */                       return arrayList6;
                            } finally {
                            }
                        case PoseLandmark.LEFT_THUMB:
/* 236 */                   String str20 = this.I00iiI;
/* 240 */                   Olil0III olil0III3 = (Olil0III) obj;
/* 244 */                   oiIIl0O1l0lI00000oIO = olil0III3.I00000oIO("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                            try {
/* 248 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str20);
/* 251 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 254 */                       int iI00000oIO36 = lO01iO1I1lOi.I00000oIO(olil0III3);
/* 258 */                       oiIIl0O1l0lI00000oIO.close();
/* 261 */                       return Integer.valueOf(iI00000oIO36);
                            } finally {
                            }
                        case PoseLandmark.RIGHT_THUMB:
/* 175 */                   String str21 = this.I00iiI;
/* 183 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT state FROM workspec WHERE id=?");
                            try {
/* 187 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str21);
/* 194 */                       if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 209 */                           Integer numValueOf2 = oiIIl0O1l0lI00000oIO.isNull(0) ? null : Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(0));
/* 213 */                           if (numValueOf2 != null) {
/* 221 */                               i01ioio1loI000II = liIOOIo0.I000II(numValueOf2.intValue());
                                    }
                                } else {
/* 215 */                           i01ioio1loI000II = null;
                                }
/* 231 */                       return i01ioio1loI000II;
                            } finally {
                            }
                        case PoseLandmark.LEFT_HIP:
/* 127 */                   String str22 = this.I00iiI;
/* 135 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT schedule_requested_at FROM workspec WHERE id=?");
                            try {
/* 139 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str22);
/* 160 */                       return (!oiIIl0O1l0lI00000oIO.I00ol1() || oiIIl0O1l0lI00000oIO.isNull(0)) ? null : Long.valueOf(oiIIl0O1l0lI00000oIO.getLong(0));
                            } finally {
                            }
                        case PoseLandmark.RIGHT_HIP:
/* 100 */                   String str23 = this.I00iiI;
/* 108 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("DELETE FROM worktag WHERE work_spec_id=?");
                            try {
/* 112 */                       oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str23);
/* 115 */                       oiIIl0O1l0lI00000oIO.I00ol1();
/* 121 */                       return ooiIlOl1iI;
                            } finally {
                            }
                        case PoseLandmark.LEFT_KNEE:
/* 56 */                    String str24 = this.I00iiI;
/* 64 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                            try {
/* 68 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str24);
/* 73 */                        ArrayList arrayList7 = new ArrayList();
/* 80 */                        while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 86 */                            arrayList7.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 95 */                        return arrayList7;
                            } finally {
                            }
                        default:
/* 12 */                    String str25 = this.I00iiI;
/* 20 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT work_spec_id FROM worktag WHERE tag=?");
                            try {
/* 24 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str25);
/* 29 */                        ArrayList arrayList8 = new ArrayList();
/* 36 */                        while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 42 */                            arrayList8.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                                }
/* 51 */                        return arrayList8;
                            } finally {
                            }
                    }
                }
            }
