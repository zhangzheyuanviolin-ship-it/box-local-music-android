            package p000;

            import androidx.work.impl.model.WorkSpec;
            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import java.util.ArrayList;
            import kotlin.jvm.functions.Function1;
            
            public final class I0li00iII1I implements Function1 {
                public final int I00iOIl;
                public int I00iiI;

                public I0li00iII1I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
                    Integer numValueOf;
                    Integer numValueOf2;
/* 3 */             int i = this.I00iOIl;
/* 49 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 1588 */                  return Boolean.valueOf(((IliIO10oO0) obj).I0110OiO(this.I00iiI));
                        case 1:
/* 1573 */                  return Boolean.valueOf(((IliIO10oO0) obj).I0110OiO(this.I00iiI));
                        case 2:
/* 1558 */                  return Boolean.valueOf(((IliIO10oO0) obj).I0110OiO(this.I00iiI));
                        case 3:
/* 1543 */                  return Boolean.valueOf(((IliIO10oO0) obj).I0110OiO(this.I00iiI));
                        case 4:
/* 1528 */                  return Boolean.valueOf(((IliIO10oO0) obj).I010l1O(this.I00iiI));
                        case 5:
/* 1514 */                  ((GenerateContentRequest.Builder) obj).setMaxOutputTokens(Integer.valueOf(this.I00iiI));
/* 1517 */                  return ooiIlOl1iI;
                        case 6:
/* 1500 */                  ((GenerateContentRequest.Builder) obj).setMaxOutputTokens(Integer.valueOf(this.I00iiI));
/* 1503 */                  return ooiIlOl1iI;
                        case 7:
/* 1446 */                  int i2 = this.I00iiI;
/* 1450 */                  O0llO0 o0llO0 = (O0llO0) obj;
/* 1452 */                  Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 1468 */                  iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O), ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null);
/* 1471 */                  int i3 = o0llO0.I00000oIO;
/* 1474 */                  if (i3 == -1) {
/* 1476 */                      i3 = 2;
                            }
/* 1479 */                  for (int i4 = 0; i4 < i3; i4++) {
/* 1483 */                      o0llO0.I00000oIO(i2 + i4);
                            }
/* 1489 */                  return ooiIlOl1iI;
                        case 8:
/* 1402 */                  int i5 = this.I00iiI;
/* 1406 */                  O0llO0 o0llO02 = (O0llO0) obj;
/* 1408 */                  Ol1il1o1 ol1il1o1I000OOo1O2 = iOl0lOIi11.I000OOo1O();
/* 1424 */                  iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O2, iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O2), ol1il1o1I000OOo1O2 != null ? ol1il1o1I000OOo1O2.I0000oI00() : null);
/* 1427 */                  int i6 = o0llO02.I00000oIO;
/* 1430 */                  if (i6 == -1) {
/* 1432 */                      i6 = 2;
                            }
/* 1435 */                  for (int i7 = 0; i7 < i6; i7++) {
/* 1439 */                      o0llO02.I00000oIO(i5 + i7);
                            }
/* 1445 */                  return ooiIlOl1iI;
                        case 9:
/* 743 */                   int i8 = this.I00iiI;
/* 753 */                   oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                            try {
/* 762 */                       oiIIl0O1l0lI00000oIO.I000OiO(1, i8);
/* 765 */                       int iI00000oIO = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 769 */                       int iI00000oIO2 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 773 */                       int iI00000oIO3 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 777 */                       int iI00000oIO4 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 781 */                       int iI00000oIO5 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 785 */                       int iI00000oIO6 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 789 */                       int iI00000oIO7 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 793 */                       int iI00000oIO8 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 797 */                       int iI00000oIO9 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 801 */                       int iI00000oIO10 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 805 */                       int iI00000oIO11 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 811 */                       int iI00000oIO12 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 815 */                       int iI00000oIO13 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 821 */                       int iI00000oIO14 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 827 */                       int iI00000oIO15 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 835 */                       int iI00000oIO16 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 843 */                       int iI00000oIO17 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 851 */                       int iI00000oIO18 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 859 */                       int iI00000oIO19 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 867 */                       int iI00000oIO20 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 875 */                       int iI00000oIO21 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 883 */                       int iI00000oIO22 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 891 */                       int iI00000oIO23 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 899 */                       int iI00000oIO24 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 907 */                       int iI00000oIO25 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 915 */                       int iI00000oIO26 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 923 */                       int iI00000oIO27 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 931 */                       int iI00000oIO28 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 939 */                       int iI00000oIO29 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 947 */                       int iI00000oIO30 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 955 */                       int iI00000oIO31 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 963 */                       int iI00000oIO32 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 971 */                       int iI00000oIO33 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 979 */                       ArrayList arrayList = new ArrayList();
/* 986 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 988 */                           String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO);
/* 992 */                           int i9 = iI00000oIO;
/* 994 */                           int i10 = iI00000oIO13;
/* 1001 */                          i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO2));
/* 1005 */                          String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO3);
/* 1009 */                          String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO4);
/* 1013 */                          byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO5);
/* 1017 */                          Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1019 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 1027 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO6));
/* 1031 */                          long j = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO7);
/* 1035 */                          long j2 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO8);
/* 1039 */                          long j3 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO9);
/* 1047 */                          int i11 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO10);
/* 1048 */                          int i12 = iI00000oIO4;
/* 1050 */                          int i13 = iI00000oIO3;
/* 1056 */                          I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO11));
/* 1060 */                          long j4 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO12);
/* 1066 */                          long j5 = oiIIl0O1l0lI00000oIO.getLong(i10);
/* 1070 */                          long j6 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO14);
/* 1074 */                          int i14 = iI00000oIO15;
/* 1076 */                          long j7 = oiIIl0O1l0lI00000oIO.getLong(i14);
/* 1084 */                          int i15 = iI00000oIO2;
/* 1086 */                          int i16 = iI00000oIO16;
/* 1102 */                          boolean z = ((int) oiIIl0O1l0lI00000oIO.getLong(i16)) != 0;
/* 1099 */                          int i17 = iI00000oIO17;
/* 1110 */                          OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i17));
/* 1114 */                          iI00000oIO16 = i16;
/* 1116 */                          iI00000oIO17 = i17;
/* 1118 */                          int i18 = iI00000oIO18;
/* 1124 */                          int i19 = (int) oiIIl0O1l0lI00000oIO.getLong(i18);
/* 1125 */                          iI00000oIO18 = i18;
/* 1127 */                          int i20 = iI00000oIO19;
/* 1133 */                          int i21 = (int) oiIIl0O1l0lI00000oIO.getLong(i20);
/* 1134 */                          int i22 = iI00000oIO20;
/* 1136 */                          long j8 = oiIIl0O1l0lI00000oIO.getLong(i22);
/* 1142 */                          iI00000oIO19 = i20;
/* 1146 */                          int i23 = iI00000oIO21;
/* 1152 */                          int i24 = (int) oiIIl0O1l0lI00000oIO.getLong(i23);
/* 1153 */                          iI00000oIO21 = i23;
/* 1157 */                          int i25 = iI00000oIO22;
/* 1163 */                          int i26 = (int) oiIIl0O1l0lI00000oIO.getLong(i25);
/* 1164 */                          int i27 = iI00000oIO23;
/* 1179 */                          String strI00i0O4 = oiIIl0O1l0lI00000oIO.isNull(i27) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i27);
/* 1176 */                          int i28 = iI00000oIO24;
/* 1190 */                          if (oiIIl0O1l0lI00000oIO.isNull(i28)) {
/* 1192 */                              iI00000oIO23 = i27;
/* 1194 */                              iI00000oIO22 = i25;
/* 1196 */                              numValueOf = null;
                                    } else {
/* 1199 */                              iI00000oIO23 = i27;
/* 1201 */                              iI00000oIO22 = i25;
/* 1208 */                              numValueOf = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i28));
                                    }
/* 1238 */                          Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
/* 1230 */                          iI00000oIO20 = i22;
/* 1232 */                          int i29 = iI00000oIO25;
/* 1246 */                          OIIOlI oIIOlII0000oI00 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i29));
/* 1250 */                          int i30 = iI00000oIO26;
/* 1256 */                          OIIOOo oIIOOoI000l1 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i30));
/* 1260 */                          iI00000oIO24 = i28;
/* 1262 */                          iI00000oIO25 = i29;
/* 1264 */                          int i31 = iI00000oIO27;
/* 1280 */                          boolean z2 = ((int) oiIIl0O1l0lI00000oIO.getLong(i31)) != 0;
/* 1275 */                          iI00000oIO26 = i30;
/* 1277 */                          int i32 = iI00000oIO28;
/* 1297 */                          boolean z3 = ((int) oiIIl0O1l0lI00000oIO.getLong(i32)) != 0;
/* 1292 */                          iI00000oIO27 = i31;
/* 1294 */                          int i33 = iI00000oIO29;
/* 1316 */                          boolean z4 = ((int) oiIIl0O1l0lI00000oIO.getLong(i33)) != 0;
/* 1309 */                          iI00000oIO28 = i32;
/* 1311 */                          iI00000oIO29 = i33;
/* 1313 */                          int i34 = iI00000oIO30;
/* 1328 */                          int i35 = iI00000oIO31;
/* 1338 */                          int i36 = iI00000oIO32;
/* 1344 */                          int i37 = iI00000oIO33;
/* 1368 */                          iI00000oIO31 = i35;
/* 1372 */                          arrayList.add(new WorkSpec(strI00i0O, i01ioio1loI000II, strI00i0O2, strI00i0O3, ii11I1OOII1I00000oIO, ii11I1OOII1I00000oIO2, j, j2, j3, new IOo0o10i1IO(oIIOOoI000l1, oIIOlII0000oI00, z2, z3, z4, ((int) oiIIl0O1l0lI00000oIO.getLong(i34)) != 0, oiIIl0O1l0lI00000oIO.getLong(i35), oiIIl0O1l0lI00000oIO.getLong(i36), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i37))), i11, i1o1O1Ii1l0lI0000O, j4, j5, j6, j7, z, oIio0Ii1IiI0001Ioi1lo, i19, i21, j8, i24, i26, strI00i0O4, boolValueOf));
/* 1375 */                          iI00000oIO32 = i36;
/* 1377 */                          iI00000oIO30 = i34;
/* 1379 */                          iI00000oIO33 = i37;
/* 1381 */                          iI00000oIO3 = i13;
/* 1382 */                          iI00000oIO = i9;
/* 1384 */                          iI00000oIO13 = i10;
/* 1386 */                          iI00000oIO4 = i12;
/* 1388 */                          iI00000oIO2 = i15;
/* 1390 */                          iI00000oIO15 = i14;
                                }
/* 1394 */                      oiIIl0O1l0lI00000oIO.close();
/* 1397 */                      return arrayList;
                            } finally {
                            }
                        default:
/* 60 */                    int i38 = this.I00iiI;
/* 70 */                    oiIIl0O1l0lI00000oIO = ((Olil0III) obj).I00000oIO("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                            try {
/* 78 */                        oiIIl0O1l0lI00000oIO.I000OiO(1, i38);
/* 81 */                        int iI00000oIO34 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "id");
/* 85 */                        int iI00000oIO35 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "state");
/* 89 */                        int iI00000oIO36 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "worker_class_name");
/* 93 */                        int iI00000oIO37 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input_merger_class_name");
/* 97 */                        int iI00000oIO38 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "input");
/* 101 */                       int iI00000oIO39 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "output");
/* 105 */                       int iI00000oIO40 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "initial_delay");
/* 109 */                       int iI00000oIO41 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "interval_duration");
/* 113 */                       int iI00000oIO42 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "flex_duration");
/* 117 */                       int iI00000oIO43 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_attempt_count");
/* 121 */                       int iI00000oIO44 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_policy");
/* 125 */                       int iI00000oIO45 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_delay_duration");
/* 131 */                       int iI00000oIO46 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "last_enqueue_time");
/* 137 */                       int iI00000oIO47 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "minimum_retention_duration");
/* 143 */                       int iI00000oIO48 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "schedule_requested_at");
/* 151 */                       int iI00000oIO49 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "run_in_foreground");
/* 159 */                       int iI00000oIO50 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "out_of_quota_policy");
/* 167 */                       int iI00000oIO51 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "period_count");
/* 175 */                       int iI00000oIO52 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "generation");
/* 183 */                       int iI00000oIO53 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override");
/* 191 */                       int iI00000oIO54 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "next_schedule_time_override_generation");
/* 199 */                       int iI00000oIO55 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "stop_reason");
/* 207 */                       int iI00000oIO56 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trace_tag");
/* 215 */                       int iI00000oIO57 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "backoff_on_system_interruptions");
/* 223 */                       int iI00000oIO58 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_type");
/* 231 */                       int iI00000oIO59 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "required_network_request");
/* 239 */                       int iI00000oIO60 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_charging");
/* 247 */                       int iI00000oIO61 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_device_idle");
/* 255 */                       int iI00000oIO62 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_battery_not_low");
/* 263 */                       int iI00000oIO63 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "requires_storage_not_low");
/* 271 */                       int iI00000oIO64 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_content_update_delay");
/* 279 */                       int iI00000oIO65 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "trigger_max_content_delay");
/* 287 */                       int iI00000oIO66 = lO01io.I00000oIO(oiIIl0O1l0lI00000oIO, "content_uri_triggers");
/* 295 */                       ArrayList arrayList2 = new ArrayList();
/* 302 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 304 */                           String strI00i0O5 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO34);
/* 308 */                           int i39 = iI00000oIO47;
/* 310 */                           ArrayList arrayList3 = arrayList2;
/* 317 */                           i01IOiO1lO i01ioio1loI000II2 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO35));
/* 321 */                           String strI00i0O6 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO36);
/* 325 */                           String strI00i0O7 = oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO37);
/* 329 */                           byte[] blob2 = oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO38);
/* 333 */                           Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 335 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO3 = il01ool0o.I00000oIO(blob2);
/* 343 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO4 = il01ool0o.I00000oIO(oiIIl0O1l0lI00000oIO.getBlob(iI00000oIO39));
/* 347 */                           long j9 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO40);
/* 351 */                           long j10 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO41);
/* 355 */                           long j11 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO42);
/* 363 */                           int i40 = (int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO43);
/* 364 */                           int i41 = iI00000oIO34;
/* 366 */                           int i42 = iI00000oIO37;
/* 373 */                           I1o1O1Ii1l0l i1o1O1Ii1l0lI0000O2 = liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(iI00000oIO44));
/* 377 */                           long j12 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO45);
/* 381 */                           long j13 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO46);
/* 387 */                           long j14 = oiIIl0O1l0lI00000oIO.getLong(i39);
/* 391 */                           int i43 = iI00000oIO48;
/* 393 */                           long j15 = oiIIl0O1l0lI00000oIO.getLong(i43);
/* 397 */                           int i44 = iI00000oIO49;
/* 401 */                           iI00000oIO48 = i43;
/* 417 */                           boolean z5 = ((int) oiIIl0O1l0lI00000oIO.getLong(i44)) != 0;
/* 412 */                           int i45 = iI00000oIO36;
/* 414 */                           int i46 = iI00000oIO50;
/* 425 */                           OIio0Ii1Ii oIio0Ii1IiI0001Ioi1lo2 = liIOOIo0.I0001Ioi1lo((int) oiIIl0O1l0lI00000oIO.getLong(i46));
/* 429 */                           int i47 = iI00000oIO51;
/* 431 */                           int i48 = iI00000oIO35;
/* 437 */                           int i49 = (int) oiIIl0O1l0lI00000oIO.getLong(i47);
/* 438 */                           iI00000oIO50 = i46;
/* 440 */                           int i50 = iI00000oIO52;
/* 448 */                           int i51 = (int) oiIIl0O1l0lI00000oIO.getLong(i50);
/* 451 */                           long j16 = oiIIl0O1l0lI00000oIO.getLong(iI00000oIO53);
/* 459 */                           int i52 = iI00000oIO54;
/* 465 */                           int i53 = (int) oiIIl0O1l0lI00000oIO.getLong(i52);
/* 466 */                           iI00000oIO54 = i52;
/* 470 */                           int i54 = iI00000oIO55;
/* 476 */                           int i55 = (int) oiIIl0O1l0lI00000oIO.getLong(i54);
/* 477 */                           int i56 = iI00000oIO56;
/* 492 */                           String strI00i0O8 = oiIIl0O1l0lI00000oIO.isNull(i56) ? null : oiIIl0O1l0lI00000oIO.I00i0O(i56);
/* 489 */                           int i57 = iI00000oIO57;
/* 503 */                           if (oiIIl0O1l0lI00000oIO.isNull(i57)) {
/* 505 */                               iI00000oIO56 = i56;
/* 507 */                               iI00000oIO55 = i54;
/* 509 */                               numValueOf2 = null;
                                    } else {
/* 512 */                               iI00000oIO56 = i56;
/* 514 */                               iI00000oIO55 = i54;
/* 521 */                               numValueOf2 = Integer.valueOf((int) oiIIl0O1l0lI00000oIO.getLong(i57));
                                    }
/* 551 */                           Boolean boolValueOf2 = numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null;
/* 545 */                           int i58 = iI00000oIO58;
/* 559 */                           OIIOlI oIIOlII0000oI002 = liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(i58));
/* 563 */                           int i59 = iI00000oIO59;
/* 569 */                           OIIOOo oIIOOoI000l12 = liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(i59));
/* 577 */                           int i60 = iI00000oIO60;
/* 593 */                           boolean z6 = ((int) oiIIl0O1l0lI00000oIO.getLong(i60)) != 0;
/* 590 */                           int i61 = iI00000oIO61;
/* 610 */                           boolean z7 = ((int) oiIIl0O1l0lI00000oIO.getLong(i61)) != 0;
/* 607 */                           int i62 = iI00000oIO62;
/* 628 */                           boolean z8 = ((int) oiIIl0O1l0lI00000oIO.getLong(i62)) != 0;
/* 623 */                           iI00000oIO62 = i62;
/* 625 */                           int i63 = iI00000oIO63;
/* 640 */                           int i64 = iI00000oIO64;
/* 650 */                           int i65 = iI00000oIO65;
/* 656 */                           iI00000oIO64 = i64;
/* 658 */                           int i66 = iI00000oIO66;
/* 686 */                           iI00000oIO66 = i66;
/* 690 */                           arrayList3.add(new WorkSpec(strI00i0O5, i01ioio1loI000II2, strI00i0O6, strI00i0O7, ii11I1OOII1I00000oIO3, ii11I1OOII1I00000oIO4, j9, j10, j11, new IOo0o10i1IO(oIIOOoI000l12, oIIOlII0000oI002, z6, z7, z8, ((int) oiIIl0O1l0lI00000oIO.getLong(i63)) != 0, oiIIl0O1l0lI00000oIO.getLong(i64), oiIIl0O1l0lI00000oIO.getLong(i65), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(i66))), i40, i1o1O1Ii1l0lI0000O2, j12, j13, j14, j15, z5, oIio0Ii1IiI0001Ioi1lo2, i49, i51, j16, i53, i55, strI00i0O8, boolValueOf2));
/* 695 */                           iI00000oIO61 = i61;
/* 697 */                           iI00000oIO35 = i48;
/* 699 */                           iI00000oIO51 = i47;
/* 701 */                           iI00000oIO52 = i50;
/* 703 */                           iI00000oIO57 = i57;
/* 705 */                           iI00000oIO58 = i58;
/* 707 */                           iI00000oIO59 = i59;
/* 709 */                           iI00000oIO60 = i60;
/* 711 */                           iI00000oIO65 = i65;
/* 713 */                           iI00000oIO63 = i63;
/* 715 */                           iI00000oIO47 = i39;
/* 717 */                           iI00000oIO37 = i42;
/* 719 */                           iI00000oIO36 = i45;
/* 721 */                           iI00000oIO49 = i44;
/* 723 */                           arrayList2 = arrayList3;
/* 724 */                           iI00000oIO34 = i41;
                                }
/* 728 */                       ArrayList arrayList4 = arrayList2;
/* 729 */                       oiIIl0O1l0lI00000oIO.close();
/* 732 */                       return arrayList4;
                            } finally {
                            }
                    }
                }
            }
