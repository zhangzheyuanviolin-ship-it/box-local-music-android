            package p000;

            import androidx.work.impl.model.Dependency;
            import androidx.work.impl.model.Preference;
            import androidx.work.impl.model.SystemIdInfo;
            import androidx.work.impl.model.WorkName;
            import androidx.work.impl.model.WorkProgress;
            import androidx.work.impl.model.WorkSpec;
            import androidx.work.impl.model.WorkTag;
            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import com.google.ai.edge.gallery.data.local.entities.Message;
            import com.google.ai.edge.gallery.data.local.entities.RagChunkEntity;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            
            public final class IOol1o01iII {
                public final int I00000oIO;

                public final void I00000oIO(OiIIl0O1l0l oiIIl0O1l0l, Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 631 */                   Conversation conversation = (Conversation) obj;
/* 637 */                   oiIIl0O1l0l.I00Io1o110i(1, conversation.getId());
/* 644 */                   oiIIl0O1l0l.I00Io1o110i(2, conversation.getTitle());
/* 651 */                   oiIIl0O1l0l.I00Io1o110i(3, conversation.getTaskType());
/* 658 */                   oiIIl0O1l0l.I00Io1o110i(4, conversation.getModelName());
/* 665 */                   oiIIl0O1l0l.I000OiO(5, conversation.getCreatedAt());
/* 672 */                   oiIIl0O1l0l.I000OiO(6, conversation.getUpdatedAt());
/* 680 */                   oiIIl0O1l0l.I000OiO(7, conversation.getMessageCount());
/* 687 */                   oiIIl0O1l0l.I00Io1o110i(8, conversation.getSystemPrompt());
                            break;
                        case 1:
/* 614 */                   Dependency dependency = (Dependency) obj;
/* 620 */                   oiIIl0O1l0l.I00Io1o110i(1, dependency.getWorkSpecId());
/* 627 */                   oiIIl0O1l0l.I00Io1o110i(2, dependency.getPrerequisiteId());
                            break;
                        case 2:
/* 576 */                   FaceRecord faceRecord = (FaceRecord) obj;
/* 582 */                   oiIIl0O1l0l.I000OiO(1, faceRecord.getId());
/* 589 */                   oiIIl0O1l0l.I00Io1o110i(2, faceRecord.getName());
/* 596 */                   oiIIl0O1l0l.I000iOII(3, faceRecord.getEmbedding());
/* 603 */                   oiIIl0O1l0l.I000iOII(4, faceRecord.getThumbnail());
/* 610 */                   oiIIl0O1l0l.I000OiO(5, faceRecord.getCreatedAt());
                            break;
                        case 3:
/* 510 */                   Message message = (Message) obj;
/* 516 */                   oiIIl0O1l0l.I00Io1o110i(1, message.getId());
/* 523 */                   oiIIl0O1l0l.I00Io1o110i(2, message.getConversationId());
/* 530 */                   oiIIl0O1l0l.I00Io1o110i(3, message.getRole());
/* 537 */                   oiIIl0O1l0l.I00Io1o110i(4, message.getContent());
/* 544 */                   oiIIl0O1l0l.I000OiO(5, message.getTimestamp());
/* 552 */                   oiIIl0O1l0l.I000OiO(6, message.getTokenCount());
/* 559 */                   oiIIl0O1l0l.I000OiO(7, message.getLatencyMs());
/* 562 */                   String imagePaths = message.getImagePaths();
/* 566 */                   if (imagePaths != null) {
/* 572 */                       oiIIl0O1l0l.I00Io1o110i(8, imagePaths);
                                break;
                            } else {
/* 568 */                       oiIIl0O1l0l.I000o00OoI0I(8);
                                break;
                            }
                        case 4:
/* 483 */                   Preference preference = (Preference) obj;
/* 489 */                   oiIIl0O1l0l.I00Io1o110i(1, preference.getKey());
/* 492 */                   Long value = preference.getValue();
/* 496 */                   if (value != null) {
/* 506 */                       oiIIl0O1l0l.I000OiO(2, value.longValue());
                                break;
                            } else {
/* 498 */                       oiIIl0O1l0l.I000o00OoI0I(2);
                                break;
                            }
                        case 5:
/* 444 */                   RagChunkEntity ragChunkEntity = (RagChunkEntity) obj;
/* 450 */                   oiIIl0O1l0l.I000OiO(1, ragChunkEntity.getId());
/* 457 */                   oiIIl0O1l0l.I00Io1o110i(2, ragChunkEntity.getDocumentId());
/* 465 */                   oiIIl0O1l0l.I000OiO(3, ragChunkEntity.getOrdinal());
/* 472 */                   oiIIl0O1l0l.I00Io1o110i(4, ragChunkEntity.getText());
/* 479 */                   oiIIl0O1l0l.I000iOII(5, ragChunkEntity.getEmbedding());
                            break;
                        case 6:
/* 405 */                   RagDocumentEntity ragDocumentEntity = (RagDocumentEntity) obj;
/* 411 */                   oiIIl0O1l0l.I00Io1o110i(1, ragDocumentEntity.getId());
/* 418 */                   oiIIl0O1l0l.I00Io1o110i(2, ragDocumentEntity.getTitle());
/* 425 */                   oiIIl0O1l0l.I00Io1o110i(3, ragDocumentEntity.getUri());
/* 432 */                   oiIIl0O1l0l.I000OiO(4, ragDocumentEntity.getCreatedAt());
/* 440 */                   oiIIl0O1l0l.I000OiO(5, ragDocumentEntity.getChunkCount());
                            break;
                        case 7:
/* 387 */                   oiIIl0O1l0l.I00Io1o110i(1, ((SystemIdInfo) obj).workSpecId);
/* 395 */                   oiIIl0O1l0l.I000OiO(2, r11.getGeneration());
/* 401 */                   oiIIl0O1l0l.I000OiO(3, r11.systemId);
                            break;
                        case 8:
/* 366 */                   WorkName workName = (WorkName) obj;
/* 372 */                   oiIIl0O1l0l.I00Io1o110i(1, workName.getName());
/* 379 */                   oiIIl0O1l0l.I00Io1o110i(2, workName.getWorkSpecId());
                            break;
                        case 9:
/* 343 */                   WorkProgress workProgress = (WorkProgress) obj;
/* 349 */                   oiIIl0O1l0l.I00Io1o110i(1, workProgress.getWorkSpecId());
/* 352 */                   Ii11I1OOII1 ii11I1OOII1 = Ii11I1OOII1.I00000oOI;
/* 362 */                   oiIIl0O1l0l.I000iOII(2, il01ool0o.I0000Il00O(workProgress.getProgress()));
                            break;
                        case 10:
/* 32 */                    WorkSpec workSpec = (WorkSpec) obj;
/* 36 */                    oiIIl0O1l0l.I00Io1o110i(1, workSpec.id);
/* 46 */                    oiIIl0O1l0l.I000OiO(2, liIOOIo0.I000iOII(workSpec.state));
/* 51 */                    oiIIl0O1l0l.I00Io1o110i(3, workSpec.workerClassName);
/* 56 */                    oiIIl0O1l0l.I00Io1o110i(4, workSpec.inputMergerClassName);
/* 59 */                    Ii11I1OOII1 ii11I1OOII12 = Ii11I1OOII1.I00000oOI;
/* 67 */                    oiIIl0O1l0l.I000iOII(5, il01ool0o.I0000Il00O(workSpec.input));
/* 76 */                    oiIIl0O1l0l.I000iOII(6, il01ool0o.I0000Il00O(workSpec.output));
/* 81 */                    oiIIl0O1l0l.I000OiO(7, workSpec.initialDelay);
/* 86 */                    oiIIl0O1l0l.I000OiO(8, workSpec.intervalDuration);
/* 93 */                    oiIIl0O1l0l.I000OiO(9, workSpec.flexDuration);
/* 101 */                   oiIIl0O1l0l.I000OiO(10, workSpec.runAttemptCount);
/* 113 */                   oiIIl0O1l0l.I000OiO(11, liIOOIo0.I00000oIO(workSpec.backoffPolicy));
/* 120 */                   oiIIl0O1l0l.I000OiO(12, workSpec.backoffDelayDuration);
/* 127 */                   oiIIl0O1l0l.I000OiO(13, workSpec.lastEnqueueTime);
/* 134 */                   oiIIl0O1l0l.I000OiO(14, workSpec.minimumRetentionDuration);
/* 141 */                   oiIIl0O1l0l.I000OiO(15, workSpec.scheduleRequestedAt);
/* 149 */                   oiIIl0O1l0l.I000OiO(16, workSpec.expedited ? 1L : 0L);
/* 161 */                   oiIIl0O1l0l.I000OiO(17, liIOOIo0.I000OOo1O(workSpec.outOfQuotaPolicy));
/* 171 */                   oiIIl0O1l0l.I000OiO(18, workSpec.getPeriodCount());
/* 181 */                   oiIIl0O1l0l.I000OiO(19, workSpec.getGeneration());
/* 190 */                   oiIIl0O1l0l.I000OiO(20, workSpec.getNextScheduleTimeOverride());
/* 200 */                   oiIIl0O1l0l.I000OiO(21, workSpec.getNextScheduleTimeOverrideGeneration());
/* 210 */                   oiIIl0O1l0l.I000OiO(22, workSpec.getStopReason());
/* 213 */                   String traceTag = workSpec.getTraceTag();
/* 219 */                   if (traceTag == null) {
/* 221 */                       oiIIl0O1l0l.I000o00OoI0I(23);
                            } else {
/* 225 */                       oiIIl0O1l0l.I00Io1o110i(23, traceTag);
                            }
/* 228 */                   Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
/* 246 */                   if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
/* 248 */                       oiIIl0O1l0l.I000o00OoI0I(24);
                            } else {
/* 257 */                       oiIIl0O1l0l.I000OiO(24, r9.intValue());
                            }
/* 260 */                   IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 271 */                   oiIIl0O1l0l.I000OiO(25, liIOOIo0.I000O01llI0(iOo0o10i1IO.I00000oIO));
/* 282 */                   oiIIl0O1l0l.I000iOII(26, liIOOIo0.I0000Il00O(iOo0o10i1IO.I00000oOI));
/* 290 */                   oiIIl0O1l0l.I000OiO(27, iOo0o10i1IO.I0000Il00O ? 1L : 0L);
/* 298 */                   oiIIl0O1l0l.I000OiO(28, iOo0o10i1IO.I0000O ? 1L : 0L);
/* 306 */                   oiIIl0O1l0l.I000OiO(29, iOo0o10i1IO.I0000oI00 ? 1L : 0L);
/* 314 */                   oiIIl0O1l0l.I000OiO(30, iOo0o10i1IO.I0001Ioi1lo ? 1L : 0L);
/* 321 */                   oiIIl0O1l0l.I000OiO(31, iOo0o10i1IO.I000II);
/* 328 */                   oiIIl0O1l0l.I000OiO(32, iOo0o10i1IO.I000O01llI0);
/* 339 */                   oiIIl0O1l0l.I000iOII(33, liIOOIo0.I000OiO(iOo0o10i1IO.I000OOo1O));
                            break;
                        default:
/* 15 */                    WorkTag workTag = (WorkTag) obj;
/* 21 */                    oiIIl0O1l0l.I00Io1o110i(1, workTag.getTag());
/* 28 */                    oiIIl0O1l0l.I00Io1o110i(2, workTag.getWorkSpecId());
                            break;
                    }
                }

                public final String I00000oOI() {
                    switch (this.I00000oIO) {
                        case 0:
/* 39 */                    return "INSERT OR REPLACE INTO `conversations` (`id`,`title`,`taskType`,`modelName`,`createdAt`,`updatedAt`,`messageCount`,`systemPrompt`) VALUES (?,?,?,?,?,?,?,?)";
                        case 1:
/* 36 */                    return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                        case 2:
/* 33 */                    return "INSERT OR ABORT INTO `faces` (`id`,`name`,`embedding`,`thumbnail`,`created_at`) VALUES (nullif(?, 0),?,?,?,?)";
                        case 3:
/* 30 */                    return "INSERT OR REPLACE INTO `messages` (`id`,`conversationId`,`role`,`content`,`timestamp`,`tokenCount`,`latencyMs`,`imagePaths`) VALUES (?,?,?,?,?,?,?,?)";
                        case 4:
/* 27 */                    return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                        case 5:
/* 24 */                    return "INSERT OR REPLACE INTO `rag_chunks` (`id`,`document_id`,`ordinal`,`text`,`embedding`) VALUES (nullif(?, 0),?,?,?,?)";
                        case 6:
/* 21 */                    return "INSERT OR REPLACE INTO `rag_documents` (`id`,`title`,`uri`,`created_at`,`chunk_count`) VALUES (?,?,?,?,?)";
                        case 7:
/* 18 */                    return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                        case 8:
/* 15 */                    return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                        case 9:
/* 12 */                    return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                        case 10:
/* 9 */                     return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        default:
/* 6 */                     return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                    }
                }

                public void I0000Il00O(Olil0III olil0III, Iterable iterable) {
/* 1 */             if (iterable == null) {
/* 3 */                 return;
                    }
/* 8 */             OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(I00000oOI());
                    try {
/* 20 */                for (Object obj : iterable) {
/* 26 */                    if (obj != null) {
/* 28 */                        I00000oIO(oiIIl0O1l0lI00000oIO, obj);
/* 31 */                        oiIIl0O1l0lI00000oIO.I00ol1();
/* 34 */                        oiIIl0O1l0lI00000oIO.reset();
                            }
                        }
/* 41 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
                    } finally {
                    }
                }

                public void I0000O(Olil0III olil0III, Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
/* 8 */             OiIIl0O1l0l oiIIl0O1l0lI00000oIO = olil0III.I00000oIO(I00000oOI());
                    try {
/* 12 */                I00000oIO(oiIIl0O1l0lI00000oIO, obj);
/* 15 */                oiIIl0O1l0lI00000oIO.I00ol1();
/* 19 */                iOOl00.I00000oIO(oiIIl0O1l0lI00000oIO, null);
                    } finally {
                    }
                }
            }
