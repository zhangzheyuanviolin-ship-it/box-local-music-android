            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class i01Ol1i0 implements Function1 {
                public final int I00iOIl;
                public String I00iiI;
                public i01Ooi0O I00iiO;

                private final Object I00000oIO(Object obj) throws Exception {
/* 3 */             String str = this.I00iiI;
/* 5 */             i01Ooi0O i01ooi0o = this.I00iiO;
/* 9 */             Olil0III olil0III = (Olil0III) obj;
/* 13 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
/* 17 */            int i = 1;
                    try {
/* 18 */                oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str);
/* 23 */                int i2 = 0;
/* 24 */                I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 29 */                I1Io0i0II i1Io0i0II2 = new I1Io0i0II(0);
/* 36 */                while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 38 */                    String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 46 */                    if (!i1Io0i0II.containsKey(strI00i0O)) {
/* 53 */                        i1Io0i0II.put(strI00i0O, new ArrayList());
                            }
/* 60 */                    String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 68 */                    if (!i1Io0i0II2.containsKey(strI00i0O2)) {
/* 75 */                        i1Io0i0II2.put(strI00i0O2, new ArrayList());
                            }
                        }
/* 79 */                oiIIl0O1l0lI00000oIO.reset();
/* 82 */                i01ooi0o.I00000oOI(olil0III, i1Io0i0II);
/* 85 */                i01ooi0o.I00000oIO(olil0III, i1Io0i0II2);
/* 90 */                ArrayList arrayList = new ArrayList();
/* 97 */                while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 99 */                    String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(i2);
/* 108 */                   i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(i));
/* 113 */                   byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(2);
/* 117 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 320 */                   i1Io0i0II2 = i1Io0i0II2;
/* 341 */                   arrayList.add(new i01Ol11(strI00i0O3, i01ioio1loI000II, il01ool0o.I00000oIO(blob), oiIIl0O1l0lI00000oIO.getLong(14), oiIIl0O1l0lI00000oIO.getLong(15), oiIIl0O1l0lI00000oIO.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(5)), ((int) oiIIl0O1l0lI00000oIO.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(10)) != 0, oiIIl0O1l0lI00000oIO.getLong(11), oiIIl0O1l0lI00000oIO.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(13))), (int) oiIIl0O1l0lI00000oIO.getLong(3), liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(17)), oiIIl0O1l0lI00000oIO.getLong(18), oiIIl0O1l0lI00000oIO.getLong(19), (int) oiIIl0O1l0lI00000oIO.getLong(20), (int) oiIIl0O1l0lI00000oIO.getLong(4), oiIIl0O1l0lI00000oIO.getLong(21), (int) oiIIl0O1l0lI00000oIO.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II2)));
/* 344 */                   i2 = 0;
/* 345 */                   i = 1;
                        }
/* 348 */               oiIIl0O1l0lI00000oIO.close();
/* 351 */               return arrayList;
                    } catch (Throwable th) {
/* 352 */               oiIIl0O1l0lI00000oIO.close();
/* 437 */               throw th;
                    }
                }

                private final Object I0000O(Object obj) throws Exception {
                    i01Ol11 i01ol11;
/* 3 */             String str = this.I00iiI;
/* 5 */             i01Ooi0O i01ooi0o = this.I00iiO;
/* 9 */             Olil0III olil0III = (Olil0III) obj;
/* 13 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?");
                    try {
/* 18 */                oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str);
/* 24 */                I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 29 */                I1Io0i0II i1Io0i0II2 = new I1Io0i0II(0);
/* 36 */                while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 38 */                    String strI00i0O = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 46 */                    if (!i1Io0i0II.containsKey(strI00i0O)) {
/* 53 */                        i1Io0i0II.put(strI00i0O, new ArrayList());
                            }
/* 60 */                    String strI00i0O2 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 68 */                    if (!i1Io0i0II2.containsKey(strI00i0O2)) {
/* 75 */                        i1Io0i0II2.put(strI00i0O2, new ArrayList());
                            }
                        }
/* 79 */                oiIIl0O1l0lI00000oIO.reset();
/* 82 */                i01ooi0o.I00000oOI(olil0III, i1Io0i0II);
/* 85 */                i01ooi0o.I00000oIO(olil0III, i1Io0i0II2);
/* 92 */                if (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 94 */                    String strI00i0O3 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 103 */                   i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(1));
/* 108 */                   byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(2);
/* 112 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 114 */                   Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 123 */                   int i = (int) oiIIl0O1l0lI00000oIO.getLong(3);
/* 129 */                   int i2 = (int) oiIIl0O1l0lI00000oIO.getLong(4);
/* 331 */                   i01ol11 = new i01Ol11(strI00i0O3, i01ioio1loI000II, ii11I1OOII1I00000oIO, oiIIl0O1l0lI00000oIO.getLong(14), oiIIl0O1l0lI00000oIO.getLong(15), oiIIl0O1l0lI00000oIO.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(5)), ((int) oiIIl0O1l0lI00000oIO.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(10)) != 0, oiIIl0O1l0lI00000oIO.getLong(11), oiIIl0O1l0lI00000oIO.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(13))), i, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(17)), oiIIl0O1l0lI00000oIO.getLong(18), oiIIl0O1l0lI00000oIO.getLong(19), (int) oiIIl0O1l0lI00000oIO.getLong(20), i2, oiIIl0O1l0lI00000oIO.getLong(21), (int) oiIIl0O1l0lI00000oIO.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II2));
                        } else {
/* 335 */                   i01ol11 = null;
                        }
/* 336 */               oiIIl0O1l0lI00000oIO.close();
/* 339 */               return i01ol11;
                    } catch (Throwable th) {
/* 340 */               oiIIl0O1l0lI00000oIO.close();
/* 437 */               throw th;
                    }
                }

                @Override
                public final Object invoke(Object obj) throws Exception {
                    OiIIl0O1l0l oiIIl0O1l0lI00000oIO;
/* 5 */             int i = 17;
/* 7 */             int i2 = 16;
/* 9 */             int i3 = 15;
/* 11 */            int i4 = 14;
/* 14 */            int i5 = 3;
/* 15 */            int i6 = 2;
/* 16 */            int i7 = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 1435 */                  String str = this.I00iiI;
/* 1437 */                  i01Ooi0O i01ooi0o = this.I00iiO;
/* 1441 */                  Olil0III olil0III = (Olil0III) obj;
/* 1445 */                  OiIIl0O1l0l oiIIl0O1l0lI00000oIO2 = olil0III.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                            try {
/* 1449 */                      oiIIl0O1l0lI00000oIO2.I00Io1o110i(1, str);
/* 1454 */                      I1Io0i0II i1Io0i0II = new I1Io0i0II(0);
/* 1459 */                      I1Io0i0II i1Io0i0II2 = new I1Io0i0II(0);
/* 1466 */                      while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 1468 */                          String strI00i0O = oiIIl0O1l0lI00000oIO2.I00i0O(0);
/* 1476 */                          if (!i1Io0i0II.containsKey(strI00i0O)) {
/* 1483 */                              i1Io0i0II.put(strI00i0O, new ArrayList());
                                    }
/* 1490 */                          String strI00i0O2 = oiIIl0O1l0lI00000oIO2.I00i0O(0);
/* 1498 */                          if (!i1Io0i0II2.containsKey(strI00i0O2)) {
/* 1505 */                              i1Io0i0II2.put(strI00i0O2, new ArrayList());
                                    }
                                }
/* 1509 */                      oiIIl0O1l0lI00000oIO2.reset();
/* 1512 */                      i01ooi0o.I00000oOI(olil0III, i1Io0i0II);
/* 1515 */                      i01ooi0o.I00000oIO(olil0III, i1Io0i0II2);
/* 1520 */                      ArrayList arrayList = new ArrayList();
/* 1527 */                      while (oiIIl0O1l0lI00000oIO2.I00ol1()) {
/* 1529 */                          String strI00i0O3 = oiIIl0O1l0lI00000oIO2.I00i0O(0);
/* 1538 */                          i01IOiO1lO i01ioio1loI000II = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO2.getLong(i7));
/* 1543 */                          byte[] blob = oiIIl0O1l0lI00000oIO2.getBlob(2);
/* 1547 */                          Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 1549 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO = il01ool0o.I00000oIO(blob);
/* 1558 */                          int i8 = (int) oiIIl0O1l0lI00000oIO2.getLong(3);
/* 1563 */                          int i9 = (int) oiIIl0O1l0lI00000oIO2.getLong(4);
/* 1773 */                          arrayList.add(new i01Ol11(strI00i0O3, i01ioio1loI000II, ii11I1OOII1I00000oIO, oiIIl0O1l0lI00000oIO2.getLong(14), oiIIl0O1l0lI00000oIO2.getLong(15), oiIIl0O1l0lI00000oIO2.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO2.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO2.getLong(5)), ((int) oiIIl0O1l0lI00000oIO2.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO2.getLong(10)) != 0, oiIIl0O1l0lI00000oIO2.getLong(11), oiIIl0O1l0lI00000oIO2.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO2.getBlob(13))), i8, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO2.getLong(17)), oiIIl0O1l0lI00000oIO2.getLong(18), oiIIl0O1l0lI00000oIO2.getLong(19), (int) oiIIl0O1l0lI00000oIO2.getLong(20), i9, oiIIl0O1l0lI00000oIO2.getLong(21), (int) oiIIl0O1l0lI00000oIO2.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO2.I00i0O(0), i1Io0i0II), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO2.I00i0O(0), i1Io0i0II2)));
/* 1776 */                          i7 = 1;
                                }
/* 1779 */                      oiIIl0O1l0lI00000oIO2.close();
/* 1782 */                      return arrayList;
                            } finally {
/* 1783 */                      oiIIl0O1l0lI00000oIO2.close();
                            }
                        case 1:
/* 1084 */                  String str2 = this.I00iiI;
/* 1086 */                  i01Ooi0O i01ooi0o2 = this.I00iiO;
/* 1090 */                  Olil0III olil0III2 = (Olil0III) obj;
/* 1094 */                  oiIIl0O1l0lI00000oIO = olil0III2.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                            try {
/* 1098 */                      oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str2);
/* 1103 */                      I1Io0i0II i1Io0i0II3 = new I1Io0i0II(0);
/* 1108 */                      I1Io0i0II i1Io0i0II4 = new I1Io0i0II(0);
/* 1115 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1117 */                          String strI00i0O4 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 1125 */                          if (!i1Io0i0II3.containsKey(strI00i0O4)) {
/* 1132 */                              i1Io0i0II3.put(strI00i0O4, new ArrayList());
                                    }
/* 1139 */                          String strI00i0O5 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 1147 */                          if (!i1Io0i0II4.containsKey(strI00i0O5)) {
/* 1154 */                              i1Io0i0II4.put(strI00i0O5, new ArrayList());
                                    }
                                }
/* 1158 */                      oiIIl0O1l0lI00000oIO.reset();
/* 1161 */                      i01ooi0o2.I00000oOI(olil0III2, i1Io0i0II3);
/* 1164 */                      i01ooi0o2.I00000oIO(olil0III2, i1Io0i0II4);
/* 1169 */                      ArrayList arrayList2 = new ArrayList();
/* 1176 */                      while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 1178 */                          String strI00i0O6 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 1187 */                          i01IOiO1lO i01ioio1loI000II2 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(1));
/* 1192 */                          byte[] blob2 = oiIIl0O1l0lI00000oIO.getBlob(2);
/* 1196 */                          Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 1198 */                          Ii11I1OOII1 ii11I1OOII1I00000oIO2 = il01ool0o.I00000oIO(blob2);
/* 1207 */                          int i10 = (int) oiIIl0O1l0lI00000oIO.getLong(3);
/* 1212 */                          int i11 = (int) oiIIl0O1l0lI00000oIO.getLong(4);
/* 1422 */                          arrayList2.add(new i01Ol11(strI00i0O6, i01ioio1loI000II2, ii11I1OOII1I00000oIO2, oiIIl0O1l0lI00000oIO.getLong(14), oiIIl0O1l0lI00000oIO.getLong(15), oiIIl0O1l0lI00000oIO.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(5)), ((int) oiIIl0O1l0lI00000oIO.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(10)) != 0, oiIIl0O1l0lI00000oIO.getLong(11), oiIIl0O1l0lI00000oIO.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(13))), i10, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(17)), oiIIl0O1l0lI00000oIO.getLong(18), oiIIl0O1l0lI00000oIO.getLong(19), (int) oiIIl0O1l0lI00000oIO.getLong(20), i11, oiIIl0O1l0lI00000oIO.getLong(21), (int) oiIIl0O1l0lI00000oIO.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II3), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II4)));
                                }
/* 1427 */                      oiIIl0O1l0lI00000oIO.close();
/* 1430 */                      return arrayList2;
                            } finally {
/* 1431 */                      oiIIl0O1l0lI00000oIO.close();
                            }
                        case 2:
/* 733 */                   String str3 = this.I00iiI;
/* 735 */                   i01Ooi0O i01ooi0o3 = this.I00iiO;
/* 739 */                   Olil0III olil0III3 = (Olil0III) obj;
/* 743 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO3 = olil0III3.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                            try {
/* 747 */                       oiIIl0O1l0lI00000oIO3.I00Io1o110i(1, str3);
/* 752 */                       I1Io0i0II i1Io0i0II5 = new I1Io0i0II(0);
/* 757 */                       I1Io0i0II i1Io0i0II6 = new I1Io0i0II(0);
/* 764 */                       while (oiIIl0O1l0lI00000oIO3.I00ol1()) {
/* 766 */                           String strI00i0O7 = oiIIl0O1l0lI00000oIO3.I00i0O(0);
/* 774 */                           if (!i1Io0i0II5.containsKey(strI00i0O7)) {
/* 781 */                               i1Io0i0II5.put(strI00i0O7, new ArrayList());
                                    }
/* 788 */                           String strI00i0O8 = oiIIl0O1l0lI00000oIO3.I00i0O(0);
/* 796 */                           if (!i1Io0i0II6.containsKey(strI00i0O8)) {
/* 803 */                               i1Io0i0II6.put(strI00i0O8, new ArrayList());
                                    }
                                }
/* 807 */                       oiIIl0O1l0lI00000oIO3.reset();
/* 810 */                       i01ooi0o3.I00000oOI(olil0III3, i1Io0i0II5);
/* 813 */                       i01ooi0o3.I00000oIO(olil0III3, i1Io0i0II6);
/* 818 */                       ArrayList arrayList3 = new ArrayList();
/* 825 */                       while (oiIIl0O1l0lI00000oIO3.I00ol1()) {
/* 827 */                           String strI00i0O9 = oiIIl0O1l0lI00000oIO3.I00i0O(0);
/* 836 */                           i01IOiO1lO i01ioio1loI000II3 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO3.getLong(1));
/* 841 */                           byte[] blob3 = oiIIl0O1l0lI00000oIO3.getBlob(2);
/* 845 */                           Ii11I1OOII1 ii11I1OOII13 = Ii11I1OOII1.I00000oOI;
/* 847 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO3 = il01ool0o.I00000oIO(blob3);
/* 856 */                           int i12 = (int) oiIIl0O1l0lI00000oIO3.getLong(3);
/* 861 */                           int i13 = (int) oiIIl0O1l0lI00000oIO3.getLong(4);
/* 1071 */                          arrayList3.add(new i01Ol11(strI00i0O9, i01ioio1loI000II3, ii11I1OOII1I00000oIO3, oiIIl0O1l0lI00000oIO3.getLong(14), oiIIl0O1l0lI00000oIO3.getLong(15), oiIIl0O1l0lI00000oIO3.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO3.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO3.getLong(5)), ((int) oiIIl0O1l0lI00000oIO3.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO3.getLong(10)) != 0, oiIIl0O1l0lI00000oIO3.getLong(11), oiIIl0O1l0lI00000oIO3.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO3.getBlob(13))), i12, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO3.getLong(17)), oiIIl0O1l0lI00000oIO3.getLong(18), oiIIl0O1l0lI00000oIO3.getLong(19), (int) oiIIl0O1l0lI00000oIO3.getLong(20), i13, oiIIl0O1l0lI00000oIO3.getLong(21), (int) oiIIl0O1l0lI00000oIO3.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO3.I00i0O(0), i1Io0i0II5), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO3.I00i0O(0), i1Io0i0II6)));
                                }
/* 1076 */                      oiIIl0O1l0lI00000oIO3.close();
/* 1079 */                      return arrayList3;
                            } finally {
/* 1080 */                      oiIIl0O1l0lI00000oIO3.close();
                            }
                        case 3:
/* 382 */                   String str4 = this.I00iiI;
/* 384 */                   i01Ooi0O i01ooi0o4 = this.I00iiO;
/* 388 */                   Olil0III olil0III4 = (Olil0III) obj;
/* 392 */                   OiIIl0O1l0l oiIIl0O1l0lI00000oIO4 = olil0III4.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                            try {
/* 396 */                       oiIIl0O1l0lI00000oIO4.I00Io1o110i(1, str4);
/* 401 */                       I1Io0i0II i1Io0i0II7 = new I1Io0i0II(0);
/* 406 */                       I1Io0i0II i1Io0i0II8 = new I1Io0i0II(0);
/* 413 */                       while (oiIIl0O1l0lI00000oIO4.I00ol1()) {
/* 415 */                           String strI00i0O10 = oiIIl0O1l0lI00000oIO4.I00i0O(0);
/* 423 */                           if (!i1Io0i0II7.containsKey(strI00i0O10)) {
/* 430 */                               i1Io0i0II7.put(strI00i0O10, new ArrayList());
                                    }
/* 437 */                           String strI00i0O11 = oiIIl0O1l0lI00000oIO4.I00i0O(0);
/* 445 */                           if (!i1Io0i0II8.containsKey(strI00i0O11)) {
/* 452 */                               i1Io0i0II8.put(strI00i0O11, new ArrayList());
                                    }
                                }
/* 456 */                       oiIIl0O1l0lI00000oIO4.reset();
/* 459 */                       i01ooi0o4.I00000oOI(olil0III4, i1Io0i0II7);
/* 462 */                       i01ooi0o4.I00000oIO(olil0III4, i1Io0i0II8);
/* 467 */                       ArrayList arrayList4 = new ArrayList();
/* 474 */                       while (oiIIl0O1l0lI00000oIO4.I00ol1()) {
/* 476 */                           String strI00i0O12 = oiIIl0O1l0lI00000oIO4.I00i0O(0);
/* 485 */                           i01IOiO1lO i01ioio1loI000II4 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO4.getLong(1));
/* 490 */                           byte[] blob4 = oiIIl0O1l0lI00000oIO4.getBlob(2);
/* 494 */                           Ii11I1OOII1 ii11I1OOII14 = Ii11I1OOII1.I00000oOI;
/* 496 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO4 = il01ool0o.I00000oIO(blob4);
/* 505 */                           int i14 = (int) oiIIl0O1l0lI00000oIO4.getLong(3);
/* 510 */                           int i15 = (int) oiIIl0O1l0lI00000oIO4.getLong(4);
/* 720 */                           arrayList4.add(new i01Ol11(strI00i0O12, i01ioio1loI000II4, ii11I1OOII1I00000oIO4, oiIIl0O1l0lI00000oIO4.getLong(14), oiIIl0O1l0lI00000oIO4.getLong(15), oiIIl0O1l0lI00000oIO4.getLong(16), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO4.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO4.getLong(5)), ((int) oiIIl0O1l0lI00000oIO4.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO4.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO4.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO4.getLong(10)) != 0, oiIIl0O1l0lI00000oIO4.getLong(11), oiIIl0O1l0lI00000oIO4.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO4.getBlob(13))), i14, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO4.getLong(17)), oiIIl0O1l0lI00000oIO4.getLong(18), oiIIl0O1l0lI00000oIO4.getLong(19), (int) oiIIl0O1l0lI00000oIO4.getLong(20), i15, oiIIl0O1l0lI00000oIO4.getLong(21), (int) oiIIl0O1l0lI00000oIO4.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO4.I00i0O(0), i1Io0i0II7), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO4.I00i0O(0), i1Io0i0II8)));
                                }
/* 725 */                       oiIIl0O1l0lI00000oIO4.close();
/* 728 */                       return arrayList4;
                            } finally {
                            }
                        case 4:
/* 377 */                   return I00000oIO(obj);
                        case 5:
/* 372 */                   return I0000O(obj);
                        default:
/* 21 */                    String str5 = this.I00iiI;
/* 23 */                    i01Ooi0O i01ooi0o5 = this.I00iiO;
/* 27 */                    Olil0III olil0III5 = (Olil0III) obj;
/* 31 */                    oiIIl0O1l0lI00000oIO = olil0III5.I00000oIO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                            try {
/* 35 */                        oiIIl0O1l0lI00000oIO.I00Io1o110i(1, str5);
/* 40 */                        I1Io0i0II i1Io0i0II9 = new I1Io0i0II(0);
/* 45 */                        I1Io0i0II i1Io0i0II10 = new I1Io0i0II(0);
/* 52 */                        while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 54 */                            String strI00i0O13 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 62 */                            if (!i1Io0i0II9.containsKey(strI00i0O13)) {
/* 69 */                                i1Io0i0II9.put(strI00i0O13, new ArrayList());
                                    }
/* 76 */                            String strI00i0O14 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 84 */                            if (!i1Io0i0II10.containsKey(strI00i0O14)) {
/* 91 */                                i1Io0i0II10.put(strI00i0O14, new ArrayList());
                                    }
                                }
/* 95 */                        oiIIl0O1l0lI00000oIO.reset();
/* 98 */                        i01ooi0o5.I00000oOI(olil0III5, i1Io0i0II9);
/* 101 */                       i01ooi0o5.I00000oIO(olil0III5, i1Io0i0II10);
/* 106 */                       ArrayList arrayList5 = new ArrayList();
/* 113 */                       while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 115 */                           String strI00i0O15 = oiIIl0O1l0lI00000oIO.I00i0O(0);
/* 124 */                           i01IOiO1lO i01ioio1loI000II5 = liIOOIo0.I000II((int) oiIIl0O1l0lI00000oIO.getLong(1));
/* 128 */                           byte[] blob5 = oiIIl0O1l0lI00000oIO.getBlob(i6);
/* 132 */                           Ii11I1OOII1 ii11I1OOII15 = Ii11I1OOII1.I00000oOI;
/* 134 */                           Ii11I1OOII1 ii11I1OOII1I00000oIO5 = il01ool0o.I00000oIO(blob5);
/* 142 */                           int i16 = (int) oiIIl0O1l0lI00000oIO.getLong(i5);
/* 147 */                           int i17 = (int) oiIIl0O1l0lI00000oIO.getLong(4);
/* 349 */                           arrayList5.add(new i01Ol11(strI00i0O15, i01ioio1loI000II5, ii11I1OOII1I00000oIO5, oiIIl0O1l0lI00000oIO.getLong(i4), oiIIl0O1l0lI00000oIO.getLong(i3), oiIIl0O1l0lI00000oIO.getLong(i2), new IOo0o10i1IO(liIOOIo0.I000l1(oiIIl0O1l0lI00000oIO.getBlob(6)), liIOOIo0.I0000oI00((int) oiIIl0O1l0lI00000oIO.getLong(5)), ((int) oiIIl0O1l0lI00000oIO.getLong(7)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(8)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(9)) != 0, ((int) oiIIl0O1l0lI00000oIO.getLong(10)) != 0, oiIIl0O1l0lI00000oIO.getLong(11), oiIIl0O1l0lI00000oIO.getLong(12), liIOOIo0.I00000oOI(oiIIl0O1l0lI00000oIO.getBlob(13))), i16, liIOOIo0.I0000O((int) oiIIl0O1l0lI00000oIO.getLong(i)), oiIIl0O1l0lI00000oIO.getLong(18), oiIIl0O1l0lI00000oIO.getLong(19), (int) oiIIl0O1l0lI00000oIO.getLong(20), i17, oiIIl0O1l0lI00000oIO.getLong(21), (int) oiIIl0O1l0lI00000oIO.getLong(22), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II9), (List) O1Oii0O0loo.I00000oOI(oiIIl0O1l0lI00000oIO.I00i0O(0), i1Io0i0II10)));
/* 352 */                           i = 17;
/* 354 */                           i2 = 16;
/* 356 */                           i3 = 15;
/* 358 */                           i4 = 14;
/* 360 */                           i5 = 3;
/* 361 */                           i6 = 2;
                                }
/* 364 */                       oiIIl0O1l0lI00000oIO.close();
/* 367 */                       return arrayList5;
                            } finally {
                            }
                    }
                }
            }
