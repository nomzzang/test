package com.example.community.Member.Sequence;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@Data
public class MemberDatabaseSequence {

  @Id
  private String id;

  private long memberSeq;

}
