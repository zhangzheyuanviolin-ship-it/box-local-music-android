            package p000;

            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkSpecDao;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.List;
            
            public final class i01Ooi0O implements WorkSpecDao {
                public Oi1oIiOiIi0 I00000oIO;
                public IOol1o01iII I00000oOI;
                public IOolI11o1l I0000Il00O;

                public final void I00000oIO(Olil0III olil0III, I1Io0i0II i1Io0i0II) {
/* 5 */             I1Illo1io0 i1Illo1io0 = (I1Illo1io0) i1Io0i0II.keySet();
/* 7 */             I1Io0i0II i1Io0i0II2 = i1Illo1io0.I00iOIl;
/* 13 */            if (i1Io0i0II2.isEmpty()) {
/* 15 */                return;
                    }
/* 21 */            if (i1Io0i0II.I00iiO > 999) {
/* 25 */                i01OoIoo i01ooioo = new i01OoIoo(0);
/* 28 */                i01ooioo.I00iiI = this;
/* 30 */                i01ooioo.I00iiO = olil0III;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                lIo0olIlI1i.I00000oIO(i1Io0i0II, i01ooioo);
/* 38 */                return;
                    }
/* 41 */            StringBuilder sb = new StringBuilder();
/* 46 */            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
/* 51 */            lOi01iio0o.I00000oIO(i1Io0i0II2.I00iiO, sb);
/* 56 */            sb.append(")");
/* 63 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(sb.toString());
/* 67 */            Iterator it = i1Illo1io0.iterator();
/* 72 */            int i = 1;
                    while (true) {
/* 74 */                I1IlliII1i i1IlliII1i = (I1IlliII1i) it;
/* 80 */                if (!i1IlliII1i.hasNext()) {
                            try {
                                break;
                            } finally {
/* 144 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        } else {
/* 88 */                    oiIIl0O1l0lI00000oIO.I00Io1o110i(i, (String) i1IlliII1i.next());
/* 91 */                    i++;
                        }
                    }
/* 95 */            int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "work_spec_id");
/* 100 */           if (iI00000oIO == -1) {
/* 105 */               return;
                    }
/* 110 */           while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 120 */               List list = (List) i1Io0i0II.get(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO));
/* 122 */               if (list != null) {
/* 124 */                   byte[] blob = oiIIl0O1l0lI00000oIO.getBlob(0);
/* 128 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 134 */                   list.add(il01ool0o.I00000oIO(blob));
                        }
                    }
                }

                public final void I00000oOI(Olil0III olil0III, I1Io0i0II i1Io0i0II) {
/* 5 */             I1Illo1io0 i1Illo1io0 = (I1Illo1io0) i1Io0i0II.keySet();
/* 7 */             I1Io0i0II i1Io0i0II2 = i1Illo1io0.I00iOIl;
/* 13 */            if (i1Io0i0II2.isEmpty()) {
/* 15 */                return;
                    }
/* 21 */            if (i1Io0i0II.I00iiO > 999) {
/* 25 */                i01OoIoo i01ooioo = new i01OoIoo(1);
/* 28 */                i01ooioo.I00iiI = this;
/* 30 */                i01ooioo.I00iiO = olil0III;
/* 32 */                VarHandle.storeStoreFence();
/* 35 */                lIo0olIlI1i.I00000oIO(i1Io0i0II, i01ooioo);
/* 38 */                return;
                    }
/* 41 */            StringBuilder sb = new StringBuilder();
/* 46 */            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
/* 51 */            lOi01iio0o.I00000oIO(i1Io0i0II2.I00iiO, sb);
/* 56 */            sb.append(")");
/* 63 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(sb.toString());
/* 67 */            Iterator it = i1Illo1io0.iterator();
/* 71 */            int i = 1;
                    while (true) {
/* 73 */                I1IlliII1i i1IlliII1i = (I1IlliII1i) it;
/* 79 */                if (!i1IlliII1i.hasNext()) {
                            try {
                                break;
                            } finally {
/* 138 */                       oiIIl0O1l0lI00000oIO.close();
                            }
                        } else {
/* 87 */                    oiIIl0O1l0lI00000oIO.I00Io1o110i(i, (String) i1IlliII1i.next());
/* 90 */                    i++;
                        }
                    }
/* 94 */            int iI00000oIO = lO01oI1Io1.I00000oIO(oiIIl0O1l0lI00000oIO, "work_spec_id");
/* 99 */            if (iI00000oIO == -1) {
/* 104 */               return;
                    }
/* 109 */           while (oiIIl0O1l0lI00000oIO.I00ol1()) {
/* 119 */               List list = (List) i1Io0i0II.get(oiIIl0O1l0lI00000oIO.I00i0O(iI00000oIO));
/* 121 */               if (list != null) {
/* 128 */                   list.add(oiIIl0O1l0lI00000oIO.I00i0O(0));
                        }
                    }
                }

                @Override
                public final int countNonFinishedContentUriTriggerWorkers() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(18);
/* 10 */            VarHandle.storeStoreFence();
/* 21 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO)).intValue();
                }

                @Override
                public final void delete(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(11);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }

                @Override
                public final List getAllEligibleWorkSpecsForScheduling(int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0li00iII1I i0li00iII1I = new I0li00iII1I(9);
/* 10 */            i0li00iII1I.I00iiI = i;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0li00iII1I);
                }

                @Override
                public final List getAllUnfinishedWork() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(17);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO);
                }

                @Override
                public final List getAllWorkSpecIds() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(23);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO);
                }

                @Override
                public final O110lI getAllWorkSpecIdsLiveData() {
/* 17 */            Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(24);
/* 20 */            VarHandle.storeStoreFence();
/* 24 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"workspec"}, true, ooo0i1lloioO);
                }

                @Override
                public final List getEligibleWorkForScheduling(int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0li00iII1I i0li00iII1I = new I0li00iII1I(10);
/* 10 */            i0li00iII1I.I00iiI = i;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0li00iII1I);
                }

                @Override
                public final List getEligibleWorkForSchedulingWithContentUris() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(26);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO);
                }

                @Override
                public final List getInputsFromPrerequisites(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(17);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getRecentlyCompletedWork(long j) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(9);
/* 10 */            i0o0iioo0IO.I00iiI = j;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, i0o0iioo0IO);
                }

                @Override
                public final List getRunningWork() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(25);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO);
                }

                @Override
                public final O110lI getScheduleRequestedAtLiveData(String str) {
/* 17 */            OlOoOOIIi olOoOOIIi = new OlOoOOIIi(23);
/* 20 */            olOoOOIIi.I00iiI = str;
/* 22 */            VarHandle.storeStoreFence();
/* 26 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"workspec"}, false, olOoOOIIi);
                }

                @Override
                public final List getScheduledWork() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(22);
/* 10 */            VarHandle.storeStoreFence();
/* 19 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, ooo0i1lloioO);
                }

                @Override
                public final i01IOiO1lO getState(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(22);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (i01IOiO1lO) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getUnfinishedWorkWithName(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(13);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getUnfinishedWorkWithTag(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(20);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final WorkSpec getWorkSpec(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(16);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (WorkSpec) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final List getWorkSpecIdAndStatesForName(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(12);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, false, olOoOOIIi);
                }

                @Override
                public final IlOil1ii getWorkStatusPojoFlowDataForIds(List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
/* 15 */            lOi01iio0o.I00000oIO(list.size(), sb);
/* 20 */            sb.append(")");
/* 23 */            String string = sb.toString();
/* 42 */            i01OlO1IO i01olo1io = new i01OlO1IO(0);
/* 45 */            i01olo1io.I00iiI = string;
/* 47 */            i01olo1io.I00iiO = list;
/* 49 */            i01olo1io.I00iio = this;
/* 51 */            VarHandle.storeStoreFence();
/* 55 */            return ilOooi01I.I00000oIO(this.I00000oIO, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, i01olo1io);
                }

                @Override
                public final IlOil1ii getWorkStatusPojoFlowForName(String str) {
/* 18 */            i01Ol1i0 i01ol1i0 = new i01Ol1i0(4);
/* 21 */            i01ol1i0.I00iiI = str;
/* 23 */            i01ol1i0.I00iiO = this;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return ilOooi01I.I00000oIO(this.I00000oIO, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, i01ol1i0);
                }

                @Override
                public final IlOil1ii getWorkStatusPojoFlowForTag(String str) {
/* 18 */            i01Ol1i0 i01ol1i0 = new i01Ol1i0(0);
/* 21 */            i01ol1i0.I00iiI = str;
/* 23 */            i01ol1i0.I00iiO = this;
/* 25 */            VarHandle.storeStoreFence();
/* 29 */            return ilOooi01I.I00000oIO(this.I00000oIO, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, i01ol1i0);
                }

                @Override
                public final i01Ol11 getWorkStatusPojoForId(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ol1i0 i01ol1i0 = new i01Ol1i0(5);
/* 9 */             i01ol1i0.I00iiI = str;
/* 11 */            i01ol1i0.I00iiO = this;
/* 13 */            VarHandle.storeStoreFence();
/* 21 */            return (i01Ol11) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, true, i01ol1i0);
                }

                @Override
                public final List getWorkStatusPojoForIds(List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
/* 15 */            lOi01iio0o.I00000oIO(list.size(), sb);
/* 20 */            sb.append(")");
/* 23 */            String string = sb.toString();
/* 27 */            Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 32 */            i01OlO1IO i01olo1io = new i01OlO1IO(2);
/* 35 */            i01olo1io.I00iiI = string;
/* 37 */            i01olo1io.I00iiO = list;
/* 39 */            i01olo1io.I00iio = this;
/* 41 */            VarHandle.storeStoreFence();
/* 49 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, true, i01olo1io);
                }

                @Override
                public final List getWorkStatusPojoForName(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ol1i0 i01ol1i0 = new i01Ol1i0(3);
/* 9 */             i01ol1i0.I00iiI = str;
/* 11 */            i01ol1i0.I00iiO = this;
/* 13 */            VarHandle.storeStoreFence();
/* 21 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, true, i01ol1i0);
                }

                @Override
                public final List getWorkStatusPojoForTag(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ol1i0 i01ol1i0 = new i01Ol1i0(1);
/* 9 */             i01ol1i0.I00iiI = str;
/* 11 */            i01ol1i0.I00iiO = this;
/* 13 */            VarHandle.storeStoreFence();
/* 20 */            return (List) il01ioIoI.I00000oOI(oi1oIiOiIi0, true, true, i01ol1i0);
                }

                @Override
                public final O110lI getWorkStatusPojoLiveDataForIds(List list) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
/* 15 */            lOi01iio0o.I00000oIO(list.size(), sb);
/* 20 */            sb.append(")");
/* 23 */            String string = sb.toString();
/* 46 */            i01OlO1IO i01olo1io = new i01OlO1IO(1);
/* 49 */            i01olo1io.I00iiI = string;
/* 51 */            i01olo1io.I00iiO = list;
/* 53 */            i01olo1io.I00iio = this;
/* 55 */            VarHandle.storeStoreFence();
/* 58 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, i01olo1io);
                }

                @Override
                public final O110lI getWorkStatusPojoLiveDataForName(String str) {
/* 22 */            i01Ol1i0 i01ol1i0 = new i01Ol1i0(2);
/* 25 */            i01ol1i0.I00iiI = str;
/* 27 */            i01ol1i0.I00iiO = this;
/* 29 */            VarHandle.storeStoreFence();
/* 33 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, i01ol1i0);
                }

                @Override
                public final O110lI getWorkStatusPojoLiveDataForTag(String str) {
/* 22 */            i01Ol1i0 i01ol1i0 = new i01Ol1i0(6);
/* 25 */            i01ol1i0.I00iiI = str;
/* 27 */            i01ol1i0.I00iiO = this;
/* 29 */            VarHandle.storeStoreFence();
/* 33 */            return this.I00000oIO.I0001Ioi1lo().I00000oIO(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, i01ol1i0);
                }

                @Override
                public final IlOil1ii hasUnfinishedWorkFlow() {
/* 13 */            Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(20);
/* 16 */            VarHandle.storeStoreFence();
/* 20 */            return ilOooi01I.I00000oIO(this.I00000oIO, false, new String[]{"workspec"}, ooo0i1lloioO);
                }

                @Override
                public final void incrementGeneration(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(18);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }

                @Override
                public final void incrementPeriodCount(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(15);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi);
                }

                @Override
                public final int incrementWorkSpecRunAttemptCount(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(21);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 23 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi)).intValue();
                }

                @Override
                public final void insertWorkSpec(WorkSpec workSpec) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Oli i01oli = new i01Oli(1);
/* 9 */             i01oli.I00iiI = this;
/* 11 */            i01oli.I00iiO = workSpec;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01oli);
                }

                @Override
                public final int markWorkSpecScheduled(String str, long j) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ollo11II i01ollo11ii = new i01Ollo11II(1);
/* 9 */             i01ollo11ii.I00iiI = j;
/* 11 */            i01ollo11ii.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 23 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01ollo11ii)).intValue();
                }

                @Override
                public final void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(19);
/* 10 */            VarHandle.storeStoreFence();
/* 15 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ooo0i1lloioO);
                }

                @Override
                public final int resetScheduledState() {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             Ooo0i1lloioO ooo0i1lloioO = new Ooo0i1lloioO(21);
/* 10 */            VarHandle.storeStoreFence();
/* 21 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ooo0i1lloioO)).intValue();
                }

                @Override
                public final void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OllOi00ooiII ollOi00ooiII = new OllOi00ooiII(3);
/* 9 */             ollOi00ooiII.I00iiI = str;
/* 11 */            ollOi00ooiII.I00iiO = i;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ollOi00ooiII);
                }

                @Override
                public final int resetWorkSpecRunAttemptCount(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(14);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 23 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi)).intValue();
                }

                @Override
                public final int setCancelledState(String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 7 */             OlOoOOIIi olOoOOIIi = new OlOoOOIIi(19);
/* 10 */            olOoOOIIi.I00iiI = str;
/* 12 */            VarHandle.storeStoreFence();
/* 23 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, olOoOOIIi)).intValue();
                }

                @Override
                public final void setLastEnqueueTime(String str, long j) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ollo11II i01ollo11ii = new i01Ollo11II(2);
/* 9 */             i01ollo11ii.I00iiI = j;
/* 11 */            i01ollo11ii.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01ollo11ii);
                }

                @Override
                public final void setNextScheduleTimeOverride(String str, long j) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Ollo11II i01ollo11ii = new i01Ollo11II(0);
/* 9 */             i01ollo11ii.I00iiI = j;
/* 11 */            i01ollo11ii.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01ollo11ii);
                }

                @Override
                public final void setOutput(String str, Ii11I1OOII1 ii11I1OOII1) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01O0010i i01o0010i = new i01O0010i(1);
/* 9 */             i01o0010i.I00iiI = ii11I1OOII1;
/* 11 */            i01o0010i.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01o0010i);
                }

                @Override
                public final int setState(i01IOiO1lO i01ioio1lo, String str) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01O0010i i01o0010i = new i01O0010i(2);
/* 9 */             i01o0010i.I00iiI = i01ioio1lo;
/* 11 */            i01o0010i.I00iiO = str;
/* 13 */            VarHandle.storeStoreFence();
/* 24 */            return ((Number) il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01o0010i)).intValue();
                }

                @Override
                public final void setStopReason(String str, int i) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             OllOi00ooiII ollOi00ooiII = new OllOi00ooiII(2);
/* 9 */             ollOi00ooiII.I00iiO = i;
/* 11 */            ollOi00ooiII.I00iiI = str;
/* 13 */            VarHandle.storeStoreFence();
/* 18 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, ollOi00ooiII);
                }

                @Override
                public final void updateWorkSpec(WorkSpec workSpec) {
/* 1 */             Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00000oIO;
/* 6 */             i01Oli i01oli = new i01Oli(0);
/* 9 */             i01oli.I00iiI = this;
/* 11 */            i01oli.I00iiO = workSpec;
/* 13 */            VarHandle.storeStoreFence();
/* 17 */            il01ioIoI.I00000oOI(oi1oIiOiIi0, false, true, i01oli);
                }
            }
