            package p000;

            import androidx.work.impl.model.WorkSpec;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            
            public final class IOolI11o1l {
                public final int I00000oIO;

                public final void I00000oIO(OiIIl0O1l0l oiIIl0O1l0l, Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 426 */                   oiIIl0O1l0l.I00Io1o110i(1, ((Conversation) obj).getId());
                            break;
                        case 1:
/* 353 */                   Conversation conversation = (Conversation) obj;
/* 359 */                   oiIIl0O1l0l.I00Io1o110i(1, conversation.getId());
/* 366 */                   oiIIl0O1l0l.I00Io1o110i(2, conversation.getTitle());
/* 373 */                   oiIIl0O1l0l.I00Io1o110i(3, conversation.getTaskType());
/* 380 */                   oiIIl0O1l0l.I00Io1o110i(4, conversation.getModelName());
/* 387 */                   oiIIl0O1l0l.I000OiO(5, conversation.getCreatedAt());
/* 394 */                   oiIIl0O1l0l.I000OiO(6, conversation.getUpdatedAt());
/* 402 */                   oiIIl0O1l0l.I000OiO(7, conversation.getMessageCount());
/* 409 */                   oiIIl0O1l0l.I00Io1o110i(8, conversation.getSystemPrompt());
/* 416 */                   oiIIl0O1l0l.I00Io1o110i(9, conversation.getId());
                            break;
                        case 2:
/* 349 */                   oiIIl0O1l0l.I00Io1o110i(1, ((Message) obj).getId());
                            break;
                        case 3:
/* 339 */                   oiIIl0O1l0l.I00Io1o110i(1, ((RagDocumentEntity) obj).getId());
                            break;
                        default:
/* 17 */                    WorkSpec workSpec = (WorkSpec) obj;
/* 21 */                    oiIIl0O1l0l.I00Io1o110i(1, workSpec.id);
/* 31 */                    oiIIl0O1l0l.I000OiO(2, liIOOIo0.I000iOII(workSpec.state));
/* 36 */                    oiIIl0O1l0l.I00Io1o110i(3, workSpec.workerClassName);
/* 41 */                    oiIIl0O1l0l.I00Io1o110i(4, workSpec.inputMergerClassName);
/* 44 */                    Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 52 */                    oiIIl0O1l0l.I000iOII(5, il01ool0o.I0000Il00O(workSpec.input));
/* 61 */                    oiIIl0O1l0l.I000iOII(6, il01ool0o.I0000Il00O(workSpec.output));
/* 66 */                    oiIIl0O1l0l.I000OiO(7, workSpec.initialDelay);
/* 71 */                    oiIIl0O1l0l.I000OiO(8, workSpec.intervalDuration);
/* 76 */                    oiIIl0O1l0l.I000OiO(9, workSpec.flexDuration);
/* 84 */                    oiIIl0O1l0l.I000OiO(10, workSpec.runAttemptCount);
/* 96 */                    oiIIl0O1l0l.I000OiO(11, liIOOIo0.I00000oIO(workSpec.backoffPolicy));
/* 103 */                   oiIIl0O1l0l.I000OiO(12, workSpec.backoffDelayDuration);
/* 110 */                   oiIIl0O1l0l.I000OiO(13, workSpec.lastEnqueueTime);
/* 117 */                   oiIIl0O1l0l.I000OiO(14, workSpec.minimumRetentionDuration);
/* 124 */                   oiIIl0O1l0l.I000OiO(15, workSpec.scheduleRequestedAt);
/* 132 */                   oiIIl0O1l0l.I000OiO(16, workSpec.expedited ? 1L : 0L);
/* 144 */                   oiIIl0O1l0l.I000OiO(17, liIOOIo0.I000OOo1O(workSpec.outOfQuotaPolicy));
/* 154 */                   oiIIl0O1l0l.I000OiO(18, workSpec.getPeriodCount());
/* 164 */                   oiIIl0O1l0l.I000OiO(19, workSpec.getGeneration());
/* 173 */                   oiIIl0O1l0l.I000OiO(20, workSpec.getNextScheduleTimeOverride());
/* 183 */                   oiIIl0O1l0l.I000OiO(21, workSpec.getNextScheduleTimeOverrideGeneration());
/* 193 */                   oiIIl0O1l0l.I000OiO(22, workSpec.getStopReason());
/* 196 */                   String traceTag = workSpec.getTraceTag();
/* 202 */                   if (traceTag == null) {
/* 204 */                       oiIIl0O1l0l.I000o00OoI0I(23);
                            } else {
/* 208 */                       oiIIl0O1l0l.I00Io1o110i(23, traceTag);
                            }
/* 211 */                   Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
/* 229 */                   if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
/* 231 */                       oiIIl0O1l0l.I000o00OoI0I(24);
                            } else {
/* 240 */                       oiIIl0O1l0l.I000OiO(24, r10.intValue());
                            }
/* 243 */                   IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 254 */                   oiIIl0O1l0l.I000OiO(25, liIOOIo0.I000O01llI0(iOo0o10i1IO.I00000oIO));
/* 265 */                   oiIIl0O1l0l.I000iOII(26, liIOOIo0.I0000Il00O(iOo0o10i1IO.I00000oOI));
/* 273 */                   oiIIl0O1l0l.I000OiO(27, iOo0o10i1IO.I0000Il00O ? 1L : 0L);
/* 281 */                   oiIIl0O1l0l.I000OiO(28, iOo0o10i1IO.I0000O ? 1L : 0L);
/* 289 */                   oiIIl0O1l0l.I000OiO(29, iOo0o10i1IO.I0000oI00 ? 1L : 0L);
/* 297 */                   oiIIl0O1l0l.I000OiO(30, iOo0o10i1IO.I0001Ioi1lo ? 1L : 0L);
/* 304 */                   oiIIl0O1l0l.I000OiO(31, iOo0o10i1IO.I000II);
/* 311 */                   oiIIl0O1l0l.I000OiO(32, iOo0o10i1IO.I000O01llI0);
/* 322 */                   oiIIl0O1l0l.I000iOII(33, liIOOIo0.I000OiO(iOo0o10i1IO.I000OOo1O));
/* 329 */                   oiIIl0O1l0l.I00Io1o110i(34, workSpec.id);
                            break;
                    }
                }

                public void I00000oOI(Olil0III olil0III, Object obj) {
                    String str;
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
                    switch (this.I00000oIO) {
                        case 0:
/* 21 */                    str = "DELETE FROM `conversations` WHERE `id` = ?";
                            break;
                        case 1:
/* 18 */                    str = "UPDATE OR ABORT `conversations` SET `id` = ?,`title` = ?,`taskType` = ?,`modelName` = ?,`createdAt` = ?,`updatedAt` = ?,`messageCount` = ?,`systemPrompt` = ? WHERE `id` = ?";
                            break;
                        case 2:
/* 15 */                    str = "DELETE FROM `messages` WHERE `id` = ?";
                            break;
                        case 3:
/* 12 */                    str = "DELETE FROM `rag_documents` WHERE `id` = ?";
                            break;
                        default:
/* 9 */                     str = "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
                            break;
                    }
/* 23 */            OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(str);
                    try {
/* 27 */                I00000oIO(oiIIl0O1l0lI00000oIO, obj);
/* 30 */                oiIIl0O1l0lI00000oIO.I00ol1();
/* 34 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
/* 37 */                lO01iO1I1lOi.I00000oIO(olil0III);
                    } finally {
                    }
                }
            }
